package LeetCode.Easy

import scala.collection.mutable.Stack

object Task_20 extends App{
  def isValid(s: String): Boolean = {

    val mask = Map('(' -> ')', '[' -> ']', '{' -> '}')
    val stack = new Stack[Char](s.length)
    for(ch <- s) {
      if (mask.contains(ch)){
        stack.push(ch)
      } else {
        if (stack.isEmpty) return false
        if (!mask.get(stack.pop).contains(ch)) return false
      }
    }
    stack.isEmpty
  }

  println(
    isValid("()[]{}")

  )
}
