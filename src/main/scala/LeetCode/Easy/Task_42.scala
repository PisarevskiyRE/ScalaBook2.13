package LeetCode.Easy

object Task_42 extends App {

  def trap(height: Array[Int]): Int = {

    if (height.isEmpty) return 0

    var left = 0;
    var right = height.length - 1

    var result = 0

    var max_left = height(left)
    var max_right = height(right)

    while (left < right) {
      if (max_left < max_right){
        left += 1
        max_left = Math.max(max_left, height(left))
        result += max_left - height(left)
      } else {
        right -= 1
        max_right = Math.max(max_right, height(right))
        result += max_right - height(right)
      }
    }

    result
  }


  println(
    trap(Array(0,1,0,2,1,0,1,3,2,1,2,1))
  )
}
