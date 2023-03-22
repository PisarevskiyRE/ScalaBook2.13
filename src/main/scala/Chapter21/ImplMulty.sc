def printLength(seq: Seq[Int]) = println(seq.length)

implicit def intToRange(i: Int): Seq[Int] = 1 to i

implicit def intoToDigits(i: Int): Seq[Int] = i.toString.toList.map(_.toInt)





printLength(12)