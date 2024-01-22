package LeetCode.Easy

object Task_15 extends App {

  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val arr = nums.sortWith((a,b) => a < b)
    var j,k: Int = 0
    var result: List[List[Int]] = Nil
    (0 until arr.length-2).foreach(i => {
      if (arr(i) > 0)  return result
      if (i > 0 && arr(i) == arr(i-1)) {}
      else {
        j = i + 1
        k = arr.length -1
        while (j < k) {
          arr(i) + arr(j) + arr(k) match {
            case x if x < 0 => j += 1
            case x if x > 0 => k -= 1
            case x if x == 0 => {

              val tr = List(arr(i), arr(j), arr(k));
              result = result.appended(tr);

              while(j < k && arr(j) == tr(1)) { j += 1;}
              while(j < k && arr(k) == tr(2)) { k -= 1;}
            }
          }

        }
      }
    })
    result
  }


  println(

    threeSum(Array(3,0,-2,-1,1,2))
  )
}
