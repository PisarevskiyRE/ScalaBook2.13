package LeetCode.Easy

object Task_7 extends App {
  def reverse(x: Int): Int = {

    x match {
      case x if x >= 0 => x.toString.reverse.toInt
      case _ => x.abs.toString.reverse.toInt * -1
    }


  }


  println(
  reverse(1534236469))
}
