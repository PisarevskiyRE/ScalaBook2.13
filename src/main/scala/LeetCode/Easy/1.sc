


val nums: Array[Int] = Array(3,2,4)
val target: Int = 6

nums(1)
val len = nums.length
(0 to nums.length-1).flatMap( x =>
  (x+1 to nums.length-1).flatMap( y =>
    if ((nums(x) + nums(y)) == target ) Array(x,y)
    else Nil
  )
)

