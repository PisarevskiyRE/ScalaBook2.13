package LeetCode.Easy

object Task_6 extends App {




  def convert(s: String, numRows: Int): String = {

    def selectAndRemaining(str: String, n: Int): (String, String) = {
      val (selected, remaining) = str.zipWithIndex.partition {
        case (char, index) => (((index) % n == 0))
      }
      (selected.map(_._1).mkString, remaining.map(_._1).mkString)
    }

    def selectAndRemaining2(str: String, n: Int): (String, String) = {
      val (selected, remaining) = str.zipWithIndex.partition {
        case (char, index) => (((index) % n == 0) || ((index +1 ) % n == 0))
      }
      (selected.map(_._1).mkString, remaining.map(_._1).mkString)
    }

    if (numRows == 1) return s

    val koef = ((numRows -1) * 2)

    var resuls: String = ""
    var other: String = s


    (1 to numRows).foreach {
      case x if x == 1 => {
        val (s1, s2) = selectAndRemaining(s, koef)
        resuls += s1
        other = s2
      }
      case x => {
        val (s1, s2) = selectAndRemaining2(other, koef - ((2 * x) - 3))
        resuls += s1
        other = s2
      }
    }

    resuls
  }

  println(
    convert("ABCDEFGHIJKLMNOPQSTUVWXYZ", 4)
  )

}
