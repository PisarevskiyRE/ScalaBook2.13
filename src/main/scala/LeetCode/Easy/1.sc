def twoSum(nums: Array[Int], target: Int): Array[Int] = {

  val result = for {
    n1 <- nums
    n2 <- nums if (n1 + n2 == target)
  } yield n1

  result
}


twoSum(Array(2,7,11,15), 9)



