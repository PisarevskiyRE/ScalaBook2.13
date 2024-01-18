package LeetCode.Easy

import scala.util.Try

object Task_7 extends App {
  def reverse(x: Int): Int = {
    Try(
      x match {
        case x if x >= 0 => x.toString.reverse.toInt
        case _ => x.abs.toString.reverse.toInt * -1
      }).getOrElse(0)
  }


  println(
  reverse(1534236469))
}
