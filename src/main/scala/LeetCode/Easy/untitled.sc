def findSubstring(s: String, words: Array[String]): List[Int] = {
  val n = s.length
  val m = words.length
  val k = words.headOption.map(_.length).getOrElse(0)
  if (n < m * k) return Nil
  val count = words.groupBy(identity).mapValues(_.length)
  var res = List[Int]()
  for (i <- 0 until k) {
    var left = i
    var right = i
    var map = Map[String, Int]()
    while (right + k <= n) {
      val word = s.substring(right, right + k)
      right += k
      if (count.contains(word)) {
        map += (word -> (map.getOrElse(word, 0) + 1))
        while (map(word) > count(word)) {
          val leftWord = s.substring(left, left + k)
          map += (leftWord -> (map(leftWord) - 1))
          left += k
        }
        if (right - left == m * k) res ::= left
      } else {
        map = Map[String, Int]()
        left = right
      }
    }
  }
  res.reverse
}

findSubstring("abc", Array("a","b","c")).foreach(println)