// // following were autogenerated by ./codegen/flatten_group_generator.rb at Mon Dec 01 19:29:52 -0800 2014 do not edit
// package com.twitter.scalding.typed

// /**
//  * Autogenerated methods for flattening the nested value tuples that result after
//  * joining many pipes together. These methods can be used directly, or via the
//  * the joins available in MultiJoin.
//  */
// object FlattenGroup {
//   val pairOfNones = (None, None)

//   // methods for flattening results of join / leftJoin

//   def flattenNestedTuple[A, B, C](nested: ((A, B), C)): (A, B, C) = {
//     val ((a, b), c) = nested
//     (a, b, c)
//   }

//   class FlattenLeftJoin3[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C](nested: KLL[KEY, ((A, B), C)]) {
//     def flattenValueTuple: KLL[KEY, (A, B, C)] = nested.mapValues { tup => FlattenGroup.flattenNestedTuple(tup) }
//   }

//   implicit def toFlattenLeftJoin3[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C](nested: KLL[KEY, ((A, B), C)]) = new FlattenLeftJoin3(nested)

//   def flattenNestedTuple[A, B, C, D](nested: (((A, B), C), D)): (A, B, C, D) = {
//     val (((a, b), c), d) = nested
//     (a, b, c, d)
//   }

//   class FlattenLeftJoin4[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D](nested: KLL[KEY, (((A, B), C), D)]) {
//     def flattenValueTuple: KLL[KEY, (A, B, C, D)] = nested.mapValues { tup => FlattenGroup.flattenNestedTuple(tup) }
//   }

//   implicit def toFlattenLeftJoin4[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D](nested: KLL[KEY, (((A, B), C), D)]) = new FlattenLeftJoin4(nested)

//   def flattenNestedTuple[A, B, C, D, E](nested: ((((A, B), C), D), E)): (A, B, C, D, E) = {
//     val ((((a, b), c), d), e) = nested
//     (a, b, c, d, e)
//   }

//   class FlattenLeftJoin5[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D, E](nested: KLL[KEY, ((((A, B), C), D), E)]) {
//     def flattenValueTuple: KLL[KEY, (A, B, C, D, E)] = nested.mapValues { tup => FlattenGroup.flattenNestedTuple(tup) }
//   }

//   implicit def toFlattenLeftJoin5[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D, E](nested: KLL[KEY, ((((A, B), C), D), E)]) = new FlattenLeftJoin5(nested)

//   def flattenNestedTuple[A, B, C, D, E, F](nested: (((((A, B), C), D), E), F)): (A, B, C, D, E, F) = {
//     val (((((a, b), c), d), e), f) = nested
//     (a, b, c, d, e, f)
//   }

//   class FlattenLeftJoin6[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D, E, F](nested: KLL[KEY, (((((A, B), C), D), E), F)]) {
//     def flattenValueTuple: KLL[KEY, (A, B, C, D, E, F)] = nested.mapValues { tup => FlattenGroup.flattenNestedTuple(tup) }
//   }

//   implicit def toFlattenLeftJoin6[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D, E, F](nested: KLL[KEY, (((((A, B), C), D), E), F)]) = new FlattenLeftJoin6(nested)

//   def flattenNestedTuple[A, B, C, D, E, F, G](nested: ((((((A, B), C), D), E), F), G)): (A, B, C, D, E, F, G) = {
//     val ((((((a, b), c), d), e), f), g) = nested
//     (a, b, c, d, e, f, g)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H](nested: (((((((A, B), C), D), E), F), G), H)): (A, B, C, D, E, F, G, H) = {
//     val (((((((a, b), c), d), e), f), g), h) = nested
//     (a, b, c, d, e, f, g, h)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I](nested: ((((((((A, B), C), D), E), F), G), H), I)): (A, B, C, D, E, F, G, H, I) = {
//     val ((((((((a, b), c), d), e), f), g), h), i) = nested
//     (a, b, c, d, e, f, g, h, i)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J](nested: (((((((((A, B), C), D), E), F), G), H), I), J)): (A, B, C, D, E, F, G, H, I, J) = {
//     val (((((((((a, b), c), d), e), f), g), h), i), j) = nested
//     (a, b, c, d, e, f, g, h, i, j)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K](nested: ((((((((((A, B), C), D), E), F), G), H), I), J), K)): (A, B, C, D, E, F, G, H, I, J, K) = {
//     val ((((((((((a, b), c), d), e), f), g), h), i), j), k) = nested
//     (a, b, c, d, e, f, g, h, i, j, k)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K, L](nested: (((((((((((A, B), C), D), E), F), G), H), I), J), K), L)): (A, B, C, D, E, F, G, H, I, J, K, L) = {
//     val (((((((((((a, b), c), d), e), f), g), h), i), j), k), l) = nested
//     (a, b, c, d, e, f, g, h, i, j, k, l)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K, L, M](nested: ((((((((((((A, B), C), D), E), F), G), H), I), J), K), L), M)): (A, B, C, D, E, F, G, H, I, J, K, L, M) = {
//     val ((((((((((((a, b), c), d), e), f), g), h), i), j), k), l), m) = nested
//     (a, b, c, d, e, f, g, h, i, j, k, l, m)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N](nested: (((((((((((((A, B), C), D), E), F), G), H), I), J), K), L), M), N)): (A, B, C, D, E, F, G, H, I, J, K, L, M, N) = {
//     val (((((((((((((a, b), c), d), e), f), g), h), i), j), k), l), m), n) = nested
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](nested: ((((((((((((((A, B), C), D), E), F), G), H), I), J), K), L), M), N), O)): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O) = {
//     val ((((((((((((((a, b), c), d), e), f), g), h), i), j), k), l), m), n), o) = nested
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](nested: (((((((((((((((A, B), C), D), E), F), G), H), I), J), K), L), M), N), O), P)): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P) = {
//     val (((((((((((((((a, b), c), d), e), f), g), h), i), j), k), l), m), n), o), p) = nested
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](nested: ((((((((((((((((A, B), C), D), E), F), G), H), I), J), K), L), M), N), O), P), Q)): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q) = {
//     val ((((((((((((((((a, b), c), d), e), f), g), h), i), j), k), l), m), n), o), p), q) = nested
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R](nested: (((((((((((((((((A, B), C), D), E), F), G), H), I), J), K), L), M), N), O), P), Q), R)): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R) = {
//     val (((((((((((((((((a, b), c), d), e), f), g), h), i), j), k), l), m), n), o), p), q), r) = nested
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S](nested: ((((((((((((((((((A, B), C), D), E), F), G), H), I), J), K), L), M), N), O), P), Q), R), S)): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S) = {
//     val ((((((((((((((((((a, b), c), d), e), f), g), h), i), j), k), l), m), n), o), p), q), r), s) = nested
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T](nested: (((((((((((((((((((A, B), C), D), E), F), G), H), I), J), K), L), M), N), O), P), Q), R), S), T)): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T) = {
//     val (((((((((((((((((((a, b), c), d), e), f), g), h), i), j), k), l), m), n), o), p), q), r), s), t) = nested
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U](nested: ((((((((((((((((((((A, B), C), D), E), F), G), H), I), J), K), L), M), N), O), P), Q), R), S), T), U)): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) = {
//     val ((((((((((((((((((((a, b), c), d), e), f), g), h), i), j), k), l), m), n), o), p), q), r), s), t), u) = nested
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u)
//   }

//   def flattenNestedTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V](nested: (((((((((((((((((((((A, B), C), D), E), F), G), H), I), J), K), L), M), N), O), P), Q), R), S), T), U), V)): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V) = {
//     val (((((((((((((((((((((a, b), c), d), e), f), g), h), i), j), k), l), m), n), o), p), q), r), s), t), u), v) = nested
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v)
//   }

//   // methods for flattening results of outerJoin

//   def flattenNestedOptionTuple[A, B, C](nested: (Option[(Option[A], Option[B])], Option[C])): (Option[A], Option[B], Option[C]) = {
//     val (rest1, c) = nested
//     val (a, b) = rest1.getOrElse(pairOfNones)
//     (a, b, c)
//   }

//   class FlattenOuterJoin3[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C](nested: KLL[KEY, (Option[(Option[A], Option[B])], Option[C])]) {
//     def flattenValueTuple: KLL[KEY, (Option[A], Option[B], Option[C])] = nested.mapValues { tup => FlattenGroup.flattenNestedOptionTuple(tup) }
//   }

//   implicit def toFlattenOuterJoin3[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C](nested: KLL[KEY, (Option[(Option[A], Option[B])], Option[C])]) = new FlattenOuterJoin3(nested)

//   def flattenNestedOptionTuple[A, B, C, D](nested: (Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])): (Option[A], Option[B], Option[C], Option[D]) = {
//     val (rest1, d) = nested
//     val (rest2, c) = rest1.getOrElse(pairOfNones)
//     val (a, b) = rest2.getOrElse(pairOfNones)
//     (a, b, c, d)
//   }

//   class FlattenOuterJoin4[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D](nested: KLL[KEY, (Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])]) {
//     def flattenValueTuple: KLL[KEY, (Option[A], Option[B], Option[C], Option[D])] = nested.mapValues { tup => FlattenGroup.flattenNestedOptionTuple(tup) }
//   }

//   implicit def toFlattenOuterJoin4[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D](nested: KLL[KEY, (Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])]) = new FlattenOuterJoin4(nested)

//   def flattenNestedOptionTuple[A, B, C, D, E](nested: (Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])): (Option[A], Option[B], Option[C], Option[D], Option[E]) = {
//     val (rest1, e) = nested
//     val (rest2, d) = rest1.getOrElse(pairOfNones)
//     val (rest3, c) = rest2.getOrElse(pairOfNones)
//     val (a, b) = rest3.getOrElse(pairOfNones)
//     (a, b, c, d, e)
//   }

//   class FlattenOuterJoin5[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D, E](nested: KLL[KEY, (Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])]) {
//     def flattenValueTuple: KLL[KEY, (Option[A], Option[B], Option[C], Option[D], Option[E])] = nested.mapValues { tup => FlattenGroup.flattenNestedOptionTuple(tup) }
//   }

//   implicit def toFlattenOuterJoin5[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D, E](nested: KLL[KEY, (Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])]) = new FlattenOuterJoin5(nested)

//   def flattenNestedOptionTuple[A, B, C, D, E, F](nested: (Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F]) = {
//     val (rest1, f) = nested
//     val (rest2, e) = rest1.getOrElse(pairOfNones)
//     val (rest3, d) = rest2.getOrElse(pairOfNones)
//     val (rest4, c) = rest3.getOrElse(pairOfNones)
//     val (a, b) = rest4.getOrElse(pairOfNones)
//     (a, b, c, d, e, f)
//   }

//   class FlattenOuterJoin6[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D, E, F](nested: KLL[KEY, (Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])]) {
//     def flattenValueTuple: KLL[KEY, (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F])] = nested.mapValues { tup => FlattenGroup.flattenNestedOptionTuple(tup) }
//   }

//   implicit def toFlattenOuterJoin6[KEY, KLL[KLL_K, +KLL_V] <: KeyedListLike[KLL_K, KLL_V, KLL], A, B, C, D, E, F](nested: KLL[KEY, (Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])]) = new FlattenOuterJoin6(nested)

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G](nested: (Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G]) = {
//     val (rest1, g) = nested
//     val (rest2, f) = rest1.getOrElse(pairOfNones)
//     val (rest3, e) = rest2.getOrElse(pairOfNones)
//     val (rest4, d) = rest3.getOrElse(pairOfNones)
//     val (rest5, c) = rest4.getOrElse(pairOfNones)
//     val (a, b) = rest5.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H]) = {
//     val (rest1, h) = nested
//     val (rest2, g) = rest1.getOrElse(pairOfNones)
//     val (rest3, f) = rest2.getOrElse(pairOfNones)
//     val (rest4, e) = rest3.getOrElse(pairOfNones)
//     val (rest5, d) = rest4.getOrElse(pairOfNones)
//     val (rest6, c) = rest5.getOrElse(pairOfNones)
//     val (a, b) = rest6.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I]) = {
//     val (rest1, i) = nested
//     val (rest2, h) = rest1.getOrElse(pairOfNones)
//     val (rest3, g) = rest2.getOrElse(pairOfNones)
//     val (rest4, f) = rest3.getOrElse(pairOfNones)
//     val (rest5, e) = rest4.getOrElse(pairOfNones)
//     val (rest6, d) = rest5.getOrElse(pairOfNones)
//     val (rest7, c) = rest6.getOrElse(pairOfNones)
//     val (a, b) = rest7.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J]) = {
//     val (rest1, j) = nested
//     val (rest2, i) = rest1.getOrElse(pairOfNones)
//     val (rest3, h) = rest2.getOrElse(pairOfNones)
//     val (rest4, g) = rest3.getOrElse(pairOfNones)
//     val (rest5, f) = rest4.getOrElse(pairOfNones)
//     val (rest6, e) = rest5.getOrElse(pairOfNones)
//     val (rest7, d) = rest6.getOrElse(pairOfNones)
//     val (rest8, c) = rest7.getOrElse(pairOfNones)
//     val (a, b) = rest8.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K]) = {
//     val (rest1, k) = nested
//     val (rest2, j) = rest1.getOrElse(pairOfNones)
//     val (rest3, i) = rest2.getOrElse(pairOfNones)
//     val (rest4, h) = rest3.getOrElse(pairOfNones)
//     val (rest5, g) = rest4.getOrElse(pairOfNones)
//     val (rest6, f) = rest5.getOrElse(pairOfNones)
//     val (rest7, e) = rest6.getOrElse(pairOfNones)
//     val (rest8, d) = rest7.getOrElse(pairOfNones)
//     val (rest9, c) = rest8.getOrElse(pairOfNones)
//     val (a, b) = rest9.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K, L](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])], Option[L])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K], Option[L]) = {
//     val (rest1, l) = nested
//     val (rest2, k) = rest1.getOrElse(pairOfNones)
//     val (rest3, j) = rest2.getOrElse(pairOfNones)
//     val (rest4, i) = rest3.getOrElse(pairOfNones)
//     val (rest5, h) = rest4.getOrElse(pairOfNones)
//     val (rest6, g) = rest5.getOrElse(pairOfNones)
//     val (rest7, f) = rest6.getOrElse(pairOfNones)
//     val (rest8, e) = rest7.getOrElse(pairOfNones)
//     val (rest9, d) = rest8.getOrElse(pairOfNones)
//     val (rest10, c) = rest9.getOrElse(pairOfNones)
//     val (a, b) = rest10.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k, l)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K, L, M](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])], Option[L])], Option[M])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K], Option[L], Option[M]) = {
//     val (rest1, m) = nested
//     val (rest2, l) = rest1.getOrElse(pairOfNones)
//     val (rest3, k) = rest2.getOrElse(pairOfNones)
//     val (rest4, j) = rest3.getOrElse(pairOfNones)
//     val (rest5, i) = rest4.getOrElse(pairOfNones)
//     val (rest6, h) = rest5.getOrElse(pairOfNones)
//     val (rest7, g) = rest6.getOrElse(pairOfNones)
//     val (rest8, f) = rest7.getOrElse(pairOfNones)
//     val (rest9, e) = rest8.getOrElse(pairOfNones)
//     val (rest10, d) = rest9.getOrElse(pairOfNones)
//     val (rest11, c) = rest10.getOrElse(pairOfNones)
//     val (a, b) = rest11.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k, l, m)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])], Option[L])], Option[M])], Option[N])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K], Option[L], Option[M], Option[N]) = {
//     val (rest1, n) = nested
//     val (rest2, m) = rest1.getOrElse(pairOfNones)
//     val (rest3, l) = rest2.getOrElse(pairOfNones)
//     val (rest4, k) = rest3.getOrElse(pairOfNones)
//     val (rest5, j) = rest4.getOrElse(pairOfNones)
//     val (rest6, i) = rest5.getOrElse(pairOfNones)
//     val (rest7, h) = rest6.getOrElse(pairOfNones)
//     val (rest8, g) = rest7.getOrElse(pairOfNones)
//     val (rest9, f) = rest8.getOrElse(pairOfNones)
//     val (rest10, e) = rest9.getOrElse(pairOfNones)
//     val (rest11, d) = rest10.getOrElse(pairOfNones)
//     val (rest12, c) = rest11.getOrElse(pairOfNones)
//     val (a, b) = rest12.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])], Option[L])], Option[M])], Option[N])], Option[O])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K], Option[L], Option[M], Option[N], Option[O]) = {
//     val (rest1, o) = nested
//     val (rest2, n) = rest1.getOrElse(pairOfNones)
//     val (rest3, m) = rest2.getOrElse(pairOfNones)
//     val (rest4, l) = rest3.getOrElse(pairOfNones)
//     val (rest5, k) = rest4.getOrElse(pairOfNones)
//     val (rest6, j) = rest5.getOrElse(pairOfNones)
//     val (rest7, i) = rest6.getOrElse(pairOfNones)
//     val (rest8, h) = rest7.getOrElse(pairOfNones)
//     val (rest9, g) = rest8.getOrElse(pairOfNones)
//     val (rest10, f) = rest9.getOrElse(pairOfNones)
//     val (rest11, e) = rest10.getOrElse(pairOfNones)
//     val (rest12, d) = rest11.getOrElse(pairOfNones)
//     val (rest13, c) = rest12.getOrElse(pairOfNones)
//     val (a, b) = rest13.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])], Option[L])], Option[M])], Option[N])], Option[O])], Option[P])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K], Option[L], Option[M], Option[N], Option[O], Option[P]) = {
//     val (rest1, p) = nested
//     val (rest2, o) = rest1.getOrElse(pairOfNones)
//     val (rest3, n) = rest2.getOrElse(pairOfNones)
//     val (rest4, m) = rest3.getOrElse(pairOfNones)
//     val (rest5, l) = rest4.getOrElse(pairOfNones)
//     val (rest6, k) = rest5.getOrElse(pairOfNones)
//     val (rest7, j) = rest6.getOrElse(pairOfNones)
//     val (rest8, i) = rest7.getOrElse(pairOfNones)
//     val (rest9, h) = rest8.getOrElse(pairOfNones)
//     val (rest10, g) = rest9.getOrElse(pairOfNones)
//     val (rest11, f) = rest10.getOrElse(pairOfNones)
//     val (rest12, e) = rest11.getOrElse(pairOfNones)
//     val (rest13, d) = rest12.getOrElse(pairOfNones)
//     val (rest14, c) = rest13.getOrElse(pairOfNones)
//     val (a, b) = rest14.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])], Option[L])], Option[M])], Option[N])], Option[O])], Option[P])], Option[Q])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K], Option[L], Option[M], Option[N], Option[O], Option[P], Option[Q]) = {
//     val (rest1, q) = nested
//     val (rest2, p) = rest1.getOrElse(pairOfNones)
//     val (rest3, o) = rest2.getOrElse(pairOfNones)
//     val (rest4, n) = rest3.getOrElse(pairOfNones)
//     val (rest5, m) = rest4.getOrElse(pairOfNones)
//     val (rest6, l) = rest5.getOrElse(pairOfNones)
//     val (rest7, k) = rest6.getOrElse(pairOfNones)
//     val (rest8, j) = rest7.getOrElse(pairOfNones)
//     val (rest9, i) = rest8.getOrElse(pairOfNones)
//     val (rest10, h) = rest9.getOrElse(pairOfNones)
//     val (rest11, g) = rest10.getOrElse(pairOfNones)
//     val (rest12, f) = rest11.getOrElse(pairOfNones)
//     val (rest13, e) = rest12.getOrElse(pairOfNones)
//     val (rest14, d) = rest13.getOrElse(pairOfNones)
//     val (rest15, c) = rest14.getOrElse(pairOfNones)
//     val (a, b) = rest15.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])], Option[L])], Option[M])], Option[N])], Option[O])], Option[P])], Option[Q])], Option[R])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K], Option[L], Option[M], Option[N], Option[O], Option[P], Option[Q], Option[R]) = {
//     val (rest1, r) = nested
//     val (rest2, q) = rest1.getOrElse(pairOfNones)
//     val (rest3, p) = rest2.getOrElse(pairOfNones)
//     val (rest4, o) = rest3.getOrElse(pairOfNones)
//     val (rest5, n) = rest4.getOrElse(pairOfNones)
//     val (rest6, m) = rest5.getOrElse(pairOfNones)
//     val (rest7, l) = rest6.getOrElse(pairOfNones)
//     val (rest8, k) = rest7.getOrElse(pairOfNones)
//     val (rest9, j) = rest8.getOrElse(pairOfNones)
//     val (rest10, i) = rest9.getOrElse(pairOfNones)
//     val (rest11, h) = rest10.getOrElse(pairOfNones)
//     val (rest12, g) = rest11.getOrElse(pairOfNones)
//     val (rest13, f) = rest12.getOrElse(pairOfNones)
//     val (rest14, e) = rest13.getOrElse(pairOfNones)
//     val (rest15, d) = rest14.getOrElse(pairOfNones)
//     val (rest16, c) = rest15.getOrElse(pairOfNones)
//     val (a, b) = rest16.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])], Option[L])], Option[M])], Option[N])], Option[O])], Option[P])], Option[Q])], Option[R])], Option[S])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K], Option[L], Option[M], Option[N], Option[O], Option[P], Option[Q], Option[R], Option[S]) = {
//     val (rest1, s) = nested
//     val (rest2, r) = rest1.getOrElse(pairOfNones)
//     val (rest3, q) = rest2.getOrElse(pairOfNones)
//     val (rest4, p) = rest3.getOrElse(pairOfNones)
//     val (rest5, o) = rest4.getOrElse(pairOfNones)
//     val (rest6, n) = rest5.getOrElse(pairOfNones)
//     val (rest7, m) = rest6.getOrElse(pairOfNones)
//     val (rest8, l) = rest7.getOrElse(pairOfNones)
//     val (rest9, k) = rest8.getOrElse(pairOfNones)
//     val (rest10, j) = rest9.getOrElse(pairOfNones)
//     val (rest11, i) = rest10.getOrElse(pairOfNones)
//     val (rest12, h) = rest11.getOrElse(pairOfNones)
//     val (rest13, g) = rest12.getOrElse(pairOfNones)
//     val (rest14, f) = rest13.getOrElse(pairOfNones)
//     val (rest15, e) = rest14.getOrElse(pairOfNones)
//     val (rest16, d) = rest15.getOrElse(pairOfNones)
//     val (rest17, c) = rest16.getOrElse(pairOfNones)
//     val (a, b) = rest17.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])], Option[L])], Option[M])], Option[N])], Option[O])], Option[P])], Option[Q])], Option[R])], Option[S])], Option[T])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K], Option[L], Option[M], Option[N], Option[O], Option[P], Option[Q], Option[R], Option[S], Option[T]) = {
//     val (rest1, t) = nested
//     val (rest2, s) = rest1.getOrElse(pairOfNones)
//     val (rest3, r) = rest2.getOrElse(pairOfNones)
//     val (rest4, q) = rest3.getOrElse(pairOfNones)
//     val (rest5, p) = rest4.getOrElse(pairOfNones)
//     val (rest6, o) = rest5.getOrElse(pairOfNones)
//     val (rest7, n) = rest6.getOrElse(pairOfNones)
//     val (rest8, m) = rest7.getOrElse(pairOfNones)
//     val (rest9, l) = rest8.getOrElse(pairOfNones)
//     val (rest10, k) = rest9.getOrElse(pairOfNones)
//     val (rest11, j) = rest10.getOrElse(pairOfNones)
//     val (rest12, i) = rest11.getOrElse(pairOfNones)
//     val (rest13, h) = rest12.getOrElse(pairOfNones)
//     val (rest14, g) = rest13.getOrElse(pairOfNones)
//     val (rest15, f) = rest14.getOrElse(pairOfNones)
//     val (rest16, e) = rest15.getOrElse(pairOfNones)
//     val (rest17, d) = rest16.getOrElse(pairOfNones)
//     val (rest18, c) = rest17.getOrElse(pairOfNones)
//     val (a, b) = rest18.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])], Option[L])], Option[M])], Option[N])], Option[O])], Option[P])], Option[Q])], Option[R])], Option[S])], Option[T])], Option[U])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K], Option[L], Option[M], Option[N], Option[O], Option[P], Option[Q], Option[R], Option[S], Option[T], Option[U]) = {
//     val (rest1, u) = nested
//     val (rest2, t) = rest1.getOrElse(pairOfNones)
//     val (rest3, s) = rest2.getOrElse(pairOfNones)
//     val (rest4, r) = rest3.getOrElse(pairOfNones)
//     val (rest5, q) = rest4.getOrElse(pairOfNones)
//     val (rest6, p) = rest5.getOrElse(pairOfNones)
//     val (rest7, o) = rest6.getOrElse(pairOfNones)
//     val (rest8, n) = rest7.getOrElse(pairOfNones)
//     val (rest9, m) = rest8.getOrElse(pairOfNones)
//     val (rest10, l) = rest9.getOrElse(pairOfNones)
//     val (rest11, k) = rest10.getOrElse(pairOfNones)
//     val (rest12, j) = rest11.getOrElse(pairOfNones)
//     val (rest13, i) = rest12.getOrElse(pairOfNones)
//     val (rest14, h) = rest13.getOrElse(pairOfNones)
//     val (rest15, g) = rest14.getOrElse(pairOfNones)
//     val (rest16, f) = rest15.getOrElse(pairOfNones)
//     val (rest17, e) = rest16.getOrElse(pairOfNones)
//     val (rest18, d) = rest17.getOrElse(pairOfNones)
//     val (rest19, c) = rest18.getOrElse(pairOfNones)
//     val (a, b) = rest19.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u)
//   }

//   def flattenNestedOptionTuple[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V](nested: (Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[(Option[A], Option[B])], Option[C])], Option[D])], Option[E])], Option[F])], Option[G])], Option[H])], Option[I])], Option[J])], Option[K])], Option[L])], Option[M])], Option[N])], Option[O])], Option[P])], Option[Q])], Option[R])], Option[S])], Option[T])], Option[U])], Option[V])): (Option[A], Option[B], Option[C], Option[D], Option[E], Option[F], Option[G], Option[H], Option[I], Option[J], Option[K], Option[L], Option[M], Option[N], Option[O], Option[P], Option[Q], Option[R], Option[S], Option[T], Option[U], Option[V]) = {
//     val (rest1, v) = nested
//     val (rest2, u) = rest1.getOrElse(pairOfNones)
//     val (rest3, t) = rest2.getOrElse(pairOfNones)
//     val (rest4, s) = rest3.getOrElse(pairOfNones)
//     val (rest5, r) = rest4.getOrElse(pairOfNones)
//     val (rest6, q) = rest5.getOrElse(pairOfNones)
//     val (rest7, p) = rest6.getOrElse(pairOfNones)
//     val (rest8, o) = rest7.getOrElse(pairOfNones)
//     val (rest9, n) = rest8.getOrElse(pairOfNones)
//     val (rest10, m) = rest9.getOrElse(pairOfNones)
//     val (rest11, l) = rest10.getOrElse(pairOfNones)
//     val (rest12, k) = rest11.getOrElse(pairOfNones)
//     val (rest13, j) = rest12.getOrElse(pairOfNones)
//     val (rest14, i) = rest13.getOrElse(pairOfNones)
//     val (rest15, h) = rest14.getOrElse(pairOfNones)
//     val (rest16, g) = rest15.getOrElse(pairOfNones)
//     val (rest17, f) = rest16.getOrElse(pairOfNones)
//     val (rest18, e) = rest17.getOrElse(pairOfNones)
//     val (rest19, d) = rest18.getOrElse(pairOfNones)
//     val (rest20, c) = rest19.getOrElse(pairOfNones)
//     val (a, b) = rest20.getOrElse(pairOfNones)
//     (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v)
//   }

// }
// // end of autogenerated
