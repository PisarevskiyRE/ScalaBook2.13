package LeetCode.Easy

object Task_31 extends App{

  def nextPermutation(nums: Array[Int]): Unit = {
    def swap(a: Int, b: Int): Unit ={
      val buff = a
      nums(a) = b
      nums(b) = buff
    }

    def sort(a: Int, b: Int): Unit ={
      val sortedSlice = nums.slice(a, b + 1).sorted
      nums.patch(a, sortedSlice, sortedSlice.length)
    }


    val n = nums.length
    if (n == 1) return

    var i = 1
    var lastInc = -1

    while (i < n){
      if (nums(i) > nums(i-1)) lastInc = i
      i+=1
    }

    if (lastInc == -1){
      (0 until  n/2).foreach( i=> {
        swap(i, n-i-1)
      })
      return
    }

    val mn = nums(lastInc)
    var index = lastInc;

    (lastInc until n).foreach( i => {
      if (nums(i)> nums(lastInc-1) && nums(i) < nums(index)) {
        index = i
      }
    })

    swap(lastInc-1, index)
    sort(lastInc, n)
  }


}
