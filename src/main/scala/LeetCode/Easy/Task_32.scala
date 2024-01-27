package LeetCode.Easy

object Task_32 extends App {
  def longestValidParentheses(s: String): Int = {

    var open = 0
    var close = 0
    var maxLen = 0

    (0 until s.length).foreach( i =>{
      if (s(i) == '(') open += 1
      else close += 1

      if (open == close) maxLen = math.max(maxLen, close + open)
      else if (close > open) {open = 0; close = 0;}
    })
    open = 0; close = 0;

    ( - s.length + 1 to  0).foreach( i => {

      if (s(i * -1) == '(') open += 1
      else close += 1

      if (open == close) maxLen = math.max(maxLen, close + open)
      else if (open > close) {open = 0; close = 0;}
    })


    maxLen
  }


  println(longestValidParentheses(")()())"))
}
