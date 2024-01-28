package LeetCode.Easy

object Task_33 extends App {
  def search(nums: Array[Int], target: Int): Int = {

    if (nums.isEmpty) return -1

    var left = 0
    var right = nums.size

    while (left + 1 < right){
      val mid: Int = (left + right) / 2
      var sortedLeft, sortedRight, secondLeft, secondRight = 0

      if (nums(left) < nums(mid)) {
        sortedLeft = left
        sortedRight = mid
        secondLeft = mid
        secondRight = right
      } else {
        sortedLeft = mid
        sortedRight = right
        secondLeft = left
        secondRight = mid
      }

      if (nums(sortedLeft) <= target && target <= nums(sortedRight - 1)) {
        left = sortedLeft
        right = sortedRight
      } else {
        left = secondLeft
        right = secondRight
      }
    }

    if (nums(left) == target){
      return left
    } else {
      return -1
    }
  }


  println(search(Array(4,5,6,7,0,1,2), 0))
}
