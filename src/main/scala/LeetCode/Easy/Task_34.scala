package LeetCode.Easy

object Task_34 extends App {

  def searchRange(nums: Array[Int], target: Int): Array[Int] = {

    def firstIndex(a: Array[Int], target: Int): Int = {
      var left = -1
      var right = a.length

      while (left + 1 < right){
        val mid = (left + right) / 2

        if (a(mid) < target){
          left = mid
        } else {
          right = mid
        }
      }
      right
    }

    def lastIndex(a: Array[Int], target: Int): Int = {
      var left = -1
      var right = a.length

      while (left + 1 < right){
        val mid = (left + right) / 2

        if (a(mid) <= target){
          left = mid
        } else {
          right = mid
        }
      }
      left
    }



    val first = firstIndex(nums, target)
    if (first == nums.length || nums(first) != target) return Array(-1, -1)
    val last = lastIndex(nums, target)

    Array(first, last)
  }


  println(
    searchRange(Array(5,7,7,8,8,10), 8)
  )
}
