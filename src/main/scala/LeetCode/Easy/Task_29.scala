package LeetCode.Easy

object Task_29 extends App {
  def divide(dividend: Int, divisor: Int): Int = {

    if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE

    val x: Long = dividend.toLong match {
      case i if i < 0 => i * -1
      case i => i
    }

    val y: Long = divisor.toLong match {
      case j if j < 0 => j.abs
      case j => j
    }

    def loop(div: Long, agg: Long): Long = {
      if (div < y) agg
      else loop(div - y, agg + 1)
    }

    var result = loop(x, 0)

    (dividend.toLong, divisor.toLong) match {
      case (x,y) if x > 0 && y < 0 => result = result * -1
      case (x,y) if x < 0 && y > 0 => result = result * -1
    }

    result.toInt
  }

  println(divide(-2147483648,-1))
}
