def runningSum(nums: Array[Int]): Array[Int] = {
  var sum: Int = 0
  nums.map( x => {
    sum += x
    sum
  } )
}



runningSum(Array(1,23,4))