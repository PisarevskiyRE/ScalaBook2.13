package LeetCode.Easy

object MyInsertSort extends App{


  def sortASD(a: Array[Int]): Unit = {
    var j: Int = 0
    (1 until a.length).foreach(i => {
      val curVal = a(i)
      j = i - 1
      while (j >= 0 && a(j) > curVal) {
        a(j + 1) = a(j)
        j = j - 1
      }
      a(j + 1) = curVal
    })
    a.foreach(println)
  }


  def sortDESC(a: Array[Int]): Unit = {

    var j: Int = 0
    (a.length-2  to 0 ).by(-1).foreach( i => {
      val currentVal = a(i)
      j = i + 1
      while (j <= a.length - 1 && a(j) > currentVal){
        a(j - 1) = a(j)
        j = j + 1
      }
      a(j-1) = currentVal
    })
    a.foreach(println)
  }





  //sortASD(Array(5,2,4,6,1,3))
  sortDESC(Array(5,2,4,6,1,3))

}
