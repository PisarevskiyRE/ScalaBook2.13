//def selectAndRemaining(str: String, n: Int): (String, String) = {
//  val (selected, remaining) = str.zipWithIndex.partition {
//    case (char, index) => (index + 1) % n == 0
//  }
//
//  val selectedChars = selected.map(_._1).mkString
//  val remainingChars = remaining.map(_._1).mkString
//
//  (selectedChars, remainingChars)
//}
//
//// Пример использования:
//val inputString = "ABCDEFGHIJKLMNOPQSTUVWXYZ"
//selectAndRemaining(inputString, 6)





"ABCDEFGHIJKLMNOPQSTUVWXYZ".zipWithIndex.partition {
  case (char, index) => (((index + 1) % 6 == 0) || ((index ) % 6 == 0)) && index != 0
}