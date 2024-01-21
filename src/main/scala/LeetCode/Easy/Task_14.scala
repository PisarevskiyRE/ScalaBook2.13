package LeetCode.Easy

object Task_14 extends App {
  def longestCommonPrefix(strs: Array[String]): String = {

    var prefix = strs(0)
    (1 until strs.length).foreach( x =>
      while (strs(x).indexOf(prefix) != 0){
        prefix = prefix.substring(0, prefix.length - 1);
        if (prefix.isEmpty()) return ""
      }
    )
    prefix
  }


  println(longestCommonPrefix(Array("flower","flow","flight")))
}
