package LeetCode.Easy

object Task_9 extends App{

  def isPalindrome(x: Int): Boolean = {

    x.toString == x.toString.reverse
  }

  isPalindrome(121)
}
