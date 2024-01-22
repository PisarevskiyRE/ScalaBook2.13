package LeetCode.Easy

object Task_16 extends App {
  def threeSumClosest(nums: Array[Int], target: Int): Int = {
    val arr = nums.sortWith((a,b) => a < b)
    var j,k: Int = 0
    var result: Int = Int.MaxValue
    (0 until arr.length-2).foreach(i => {
      j = i + 1
      k = arr.length -1
      while (j < k) {
        val total = arr(i) + arr(j) + arr(k)
        total match {
          case x if x < target => {
            j += 1
          }
          case x if x > target => {
            k -= 1
          }
          case x if x == target => return total
        }
        if ((total-target).abs < (result - target ).abs)
        result = total
      }
    })
    result
  }

  println(
    threeSumClosest(Array(-1,2,1,-4),1)

  )
}
