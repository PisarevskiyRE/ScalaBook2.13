package LeetCode.Easy

object MyBinarySearch extends App {

  def searchTest(a: Array[Int], n: Int): Int = {
    var left = 0
    var right = a.length
    var ans: Int = -1


    while (left <= right) {
      val mid = ((right - left) / 2) + left

      a(mid) match {
        case x if x < n => left = mid + 1
        case x if x > n => right = mid - 1
        case _ => {
          ans = mid;
          return ans;
        }
      }



    }
    ans
  }

  println(
    searchTest(Array(3,4,5,6,7,8,9,10,11), 6)
  )


}
