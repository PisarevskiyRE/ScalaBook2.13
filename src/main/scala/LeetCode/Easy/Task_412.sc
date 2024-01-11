object Solution {
  def fizzBuzz(n: Int): List[String] = {
    (1 to n).map {
      case x if (x % 3 == 0) && (x % 5 == 0) => "FizzBuzz"
      case x if x % 3 == 0 => "Fizz"
      case x if x % 5 == 0 => "Buzz"
      case x => x.toString
    }.toList
  }
}

Solution.fizzBuzz(20)