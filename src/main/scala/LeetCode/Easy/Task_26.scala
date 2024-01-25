package LeetCode.Easy

object Task_26 extends App {

  def removeDuplicates(nums: Array[Int]): Int = {
    var j = 1

    (1 until nums.length).foreach( i =>
      if (nums(i) != nums(i-1)){
        nums(j) = nums(i)
        j += 1
      }
    )
    j
  }




  val example = Array(0,0,1,1,1,2,2,3,3,4)

  println(removeDuplicates(example))


}
