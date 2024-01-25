package LeetCode.Easy

object Task_27 extends App{
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    var j = 0

    (0 until nums.length).foreach( i =>
      if (nums(i) != `val`){
        nums(j) = nums(i)
        j += 1
      }
    )
    j
  }




  val example = Array(0,0,1,1,1,2,2,3,3,4)

  println(removeElement(example, 1))
}
