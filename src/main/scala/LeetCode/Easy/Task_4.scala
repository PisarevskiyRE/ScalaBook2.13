package LeetCode.Easy


object Task_4 extends App {
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {

    val result = (nums1 ++ nums2).sortWith((a, b) => a < b).map(x => x.toFloat)

    val t = result.length match {
      case x if x % 2 == 0 =>
        (
          result(
            (
              result.length / 2) - 1 ) +

            result(result.length / 2 )
          ) / 2
      case _ => result(result.length / 2)
    }
    t
  }


  println(
    findMedianSortedArrays(Array(1,2), Array(3,4))
  )
}
