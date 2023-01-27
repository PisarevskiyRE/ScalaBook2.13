package Chapter1

object Chapter1 extends App {

  def printMsg(msg:String): Unit ={
    println(msg)
  }
  def max(x:Int, y:Int): Int ={
    if (x>y) x
    y
  }

  printMsg("Test")

  println(max(5,1).toString)



}




