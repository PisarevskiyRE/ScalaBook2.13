package LeetCode.Easy

object Task_18 extends App {
  def fourSum(nums: Array[Int], target: Int): List[List[Int]] = {

    val arr = nums.sortWith((x, y) => x < y)
    var ans: List[List[Int]] = Nil
    var k, l: Int = 0

    (0 until arr.length - 3).foreach(i => {
      if (i > 0 && arr(i) == arr(i - 1)) {}
      else {
        (i + 1 until arr.length - 2).foreach(j => {
          if (j > i+1 && arr(j) == arr(j - 1)) {}
          else {
            k = j + 1
            l = arr.length - 1

            while (k < l) {
              arr(i).toDouble + arr(j).toDouble + arr(k).toDouble + arr(l).toDouble match {
                case x if x < target => k += 1
                case x if x > target => l -= 1
                case x if x == target => {

                  val sum4: List[Int] = List(arr(i), arr(j), arr(k), arr(l))
                  ans = ans.appended(sum4)

                  while (k < l && arr(k) == sum4(2)) {
                    k += 1
                  }
                  while (k < l && arr(l) == sum4(3)) {
                    l -= 1
                  }
                }
              }
            }
          }
        })
      }
    })
    ans
  }

  println(
    fourSum(Array(2, 2, 2, 2, 2), 8)
  )

  println(
    fourSum(Array(1, 0, -1, 0, -2, 2), 0)
  )

  println(
    fourSum(Array(1000000000,1000000000,1000000000,1000000000), -294967296)
  )
}
