package LeetCode.Easy

import scala.collection.mutable

object Task_30 extends App {

  def findSubstring(s: String, words: Array[String]): List[Int] = {

    val n = s.length
    val m = words.length
    val k = words(0).length

    if (n < m * k) return Nil

    val count = words.groupBy(identity).mapValues(_.length)


    println(count)
    List()
  }


  findSubstring("barfoothefoobarman", Array("foo","bar")).foreach(println)

}
