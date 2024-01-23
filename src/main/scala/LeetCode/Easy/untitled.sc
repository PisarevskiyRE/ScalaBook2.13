
val l0 = List[String]()
val l1 = List("a", "b", "c")
val l2 = List("d","e","f")
val l3 = List("g","h","k")


l0
  .flatMap(p =>
    l1
      .flatMap(i =>
        l2
          .flatMap(j =>
            l3
              .map(k => (p. + i + j + k))
          )
      )
  )