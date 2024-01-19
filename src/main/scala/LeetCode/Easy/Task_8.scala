package LeetCode.Easy

import scala.util.matching.Regex


object Task_8 extends App{

  def myAtoi(s: String): Int = {
    val regexp = raw"^\s*([-|+]{0,1}\d+).*".r
    s match {
      case regexp(x) => ((BigInt(x) min Int.MaxValue) max Int.MinValue).toInt
      case _ => 0
    }
  }


  println(
  myAtoi("words and 987")
  )
}
