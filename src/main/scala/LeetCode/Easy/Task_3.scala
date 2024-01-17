package LeetCode.Easy

object Task_3 extends App {

  def lengthOfLongestSubstring(s: String): Int = {
    s.scanLeft("")((currStr: String, currChar: Char) => {

        println(currStr);
        println(currChar);

        currStr.substring(1 + currStr.indexOf(currChar)) + currChar
      }
      )

      .map(_.length)
      .reduce(Math.max)
  }


  lengthOfLongestSubstring("pwwkew")

}
