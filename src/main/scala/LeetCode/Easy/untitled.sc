import scala.collection.mutable._
object Solution {
  def generateParenthesis(n: Int): List[String] = {
    val validParentheses = new ListBuffer[String]

    def dfs(lCount: Int, rCount: Int, s: String): Unit = {
      if(lCount == 0 && rCount == 0) validParentheses.append(s)
      if(lCount > 0) dfs(lCount-1, rCount, s + "(")
      if(lCount < rCount ) dfs(lCount, rCount-1, s + ")")
    }
    dfs(n, n, "")
    validParentheses.toList
  }



}


Solution.generateParenthesis(3)