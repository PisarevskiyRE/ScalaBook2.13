package LeetCode.Easy

import scala.collection.mutable.ListBuffer

object Task_22 extends App {


  def generateParenthesis(n: Int): List[String] = {

    val ans = new ListBuffer[String]
    def loop(open: Int, close: Int, s: String): Unit ={

      if (open == 0 && close == 0) ans.append(s)
      if (open > 0 ) loop(open - 1, close, s + "(")
      if (open < close) loop(open, close-1, s + ")")
    }
    loop(n,n,"")
    ans.toList
  }

  println(

    generateParenthesis(3)
  )

}
