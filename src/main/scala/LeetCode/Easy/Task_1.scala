package LeetCode.Easy

object Task_1 extends App {


  val nums: Array[Int] = Array(3,2,4)
  val target: Int = 6


  val test = (0 to nums.length-1)
    .flatMap( x =>

      (x+1 to nums.length-1)
        .flatMap( y =>
              {
                        println(x.toString + " - " + y.toString);

                        if ((nums(x) + nums(y)) == target ) Array(x,y)

                        else Nil
              }
    )
  ).toArray


}
