package LeetCode.Easy

object Task_11 extends App {

  def maxArea(height: Array[Int]): Int = {
    var maxArea = 0
    var i = 0
    var j = height.length - 1

    while (i < j){
      maxArea =  Math.max(maxArea,  Math.min(height(i), height(j)) * (j-i))
      if (height(i) < height(j)){
        i += 1
      } else {
        j -= 1
      }
    }
    maxArea
  }


  println(
    maxArea(Array(1,8,6,2,5,4,8,3,7))

  )
}
