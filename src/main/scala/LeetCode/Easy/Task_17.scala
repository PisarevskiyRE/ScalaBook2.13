package LeetCode.Easy

object Task_17 extends App{
  def letterCombinations(digits: String): List[String] = {
    val m = Map(
      2 -> List("a","b","c"),
      3 -> List("d","e","f"),
      4 -> List("g","h","i"),
      5 -> List("j","k","l"),
      6 -> List("m","n","o"),
      7 -> List("p","q","r","s"),
      8 -> List("t","u","v"),
      9 -> List("w","x","y","z")
    )


    var ans: List[String] = m(digits(0).toString.toInt)

    (1 until digits.length).foreach( x =>

      ans.map( y =>

        println(
         m(x)
        )


      )
    )




//    for (s <- digits){
//
//      m(s.toString.toInt).flatMap( x=>  m(s.toString.toInt).map( ) )
//
//
//    }


    ans
  }


  println(

    letterCombinations("23")
  )
}
