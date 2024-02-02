package LeetCode.Easy

object Task_38 extends App{
  def countAndSay(n: Int): String = {
    var result = "1"
    for (i <- 2 to n) {
      var sb = ""
      var count = 1
      for (j <- 0 until result.length) {
        if (j < result.length - 1 && result(j) == result(j + 1)) count += 1
        else {
          sb += (count.toString).concat(result(j).toString)
          count = 1
        }
      }
      result = sb
    }
    result

  }
}
