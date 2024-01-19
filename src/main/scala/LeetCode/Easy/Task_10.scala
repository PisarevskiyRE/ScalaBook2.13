package LeetCode.Easy

import scala.Array.ofDim


object Task_10 extends App {
  def isMatch(s: String, p: String): Boolean = {

    val T = ofDim[Boolean](s.length + 1, p.length + 1)

    T(0)(0) = true

    (1 until T(0).length).foreach{ i =>
      if ( p(i-1) == '*') T(0)(i) = T(0)(i-2)
    }

    (1 until T.length).foreach( i =>
      (1 until T(0).length).foreach( j =>

        if (p(j-1) == '.' || p(j-1) == s(i-1)) {
          T(i)(j) = T(i-1)(j-1)
        } else if (p(j-1) == '*') {
          T(i)(j) = T(i)(j-2)
          if (p(j-2) == '.' || p(j -2) == s(i-1)) {
            T(i)(j) = T(i)(j) | T(i - 1)(j)
          }
        } else {
          T(i)(j) = false
        }
      )
    )
    T(s.length)(p.length)
  }

  isMatch("ab", ".*")
}
