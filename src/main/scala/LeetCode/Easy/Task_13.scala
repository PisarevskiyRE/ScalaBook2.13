package LeetCode.Easy

object Task_13 extends App {

  def romanToInt(s: String): Int = {

    def loop(str: String, agg: Int): Int = {
      if (str == "") agg
      else {
        str match {
          case s if (s(0) == 'M') => loop(s.tail, agg + 1000)
          case s if (s(0) == 'C' && s.length > 1 && s(1) == 'M') => loop(s.substring(2, s.length), agg + 900)
          case s if (s(0) == 'D') => loop(s.tail, agg + 500)
          case s if (s(0) == 'C' && s.length > 1 && s(1) == 'D') => loop(s.substring(2, s.length), agg + 400)
          case s if (s(0) == 'C') => loop(s.tail, agg + 100)
          case s if (s(0) == 'X' && s.length > 1 && s(1) == 'C') => loop(s.substring(2, s.length), agg + 90)
          case s if (s(0) == 'L') => loop(s.tail, agg + 50)
          case s if (s(0) == 'X' && s.length > 1 && s(1) == 'L') => loop(s.substring(2, s.length), agg + 40)
          case s if (s(0) == 'X') => loop(s.tail, agg + 10)
          case s if (s(0) == 'I' && s.length > 1 && s(1) == 'X') => loop(s.substring(2, s.length), agg + 9)
          case s if (s(0) == 'V') => loop(s.tail, agg + 5)
          case s if (s(0) == 'I' && s.length > 1 && s(1) == 'V' ) => loop(s.substring(2, s.length), agg + 4)
          case s if (s(0) == 'I') => loop(s.tail, agg + 1)
          case _ => loop("", agg)
        }
      }
    }
    loop(s, 0)
  }

  println(
    romanToInt("III")
  )

}
