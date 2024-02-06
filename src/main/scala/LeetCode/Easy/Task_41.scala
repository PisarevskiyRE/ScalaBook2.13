package LeetCode.Easy

object Task_41 extends App {

  def firstMissingPositive(nums: Array[Int]): Int = {

    nums.indices.foreach{ i =>
      if(nums(i) <= 0) nums(i) = nums.size+1
    }

    nums.indices.foreach{ i =>
      if(nums(i).abs <= nums.size) nums(nums(i).abs-1) = - (nums(nums(i).abs-1).abs)
    }

    nums.indices.find{ i =>
      nums(i)>0
    }.getOrElse(nums.size)+1


  }

  println(
    firstMissingPositive(Array(1,2,0))
  )


}
