/*
Copyright 2014 Twitter, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.twitter.scalding.typed

import com.twitter.scalding._
import org.apache.spark._
import org.apache.spark.rdd._
import org.apache.spark.broadcast.Broadcast
import com.twitter.algebird.Monoid
import scala.reflect.ClassTag

/**
 * If we can HashJoin, then we can CoGroup, but not vice-versa
 * i.e., HashJoinable is a strict subset of CoGroupable (CoGrouped, for instance
 * is CoGroupable, but not HashJoinable).
 */
trait HashJoinable[K, +V] extends CoGroupable[K, V] with KeyedPipe[K, V] {
  /** A HashJoinable has a single input into to the cogroup */
  override def inputs = List(mapped)
  /**
   * This fully replicates this entire Grouped to the argument: mapside.
   * This means that we never see the case where the key is absent in the pipe. This
   * means implementing a right-join (from the pipe) is impossible.
   * Note, there is no reduce-phase in this operation.
   * The next issue is that obviously, unlike a cogroup, for a fixed key, each joiner will
   * NOT See all the tuples with those keys. This is because the keys on the left are
   * distributed across many machines
   * See hashjoin:
   * http://docs.cascading.org/cascading/2.0/javadoc/cascading/pipe/HashJoin.html
   */
  def hashCogroupOn[V1, R: ClassTag](mapside: TypedPipe[(K, V1)])(joiner: (K, V1, Iterable[V]) => Iterator[R]): TypedPipe[(K, R)] =
    // Note, the Ordering must have that compare(x,y)== 0 being consistent with hashCode and .equals to
    // otherwise, there may be funky issues with cascading
    TypedPipeFactory({ (sc, mode) =>
      implicit val newSC = sc
      implicit val m = mode
      val rightSideBroadcasted: Broadcast[Map[K, List[V]]] = sc.broadcast(Monoid.sum(mapped.toRDD[(K, V)].collect.toSeq.map{ case (k, v) => Map(k -> List(v)) }))

      val joined: RDD[(K, R)] = mapside.toRDD.flatMap {
        case (streamK, streamV) =>
          val hashValues = rightSideBroadcasted.value.get(streamK).getOrElse(List())
          joiner(streamK, streamV, hashValues).map(streamK -> _)
      }

      //Construct the new TypedPipe
      TypedPipe.from[(K, R)](joined)
    })
}
