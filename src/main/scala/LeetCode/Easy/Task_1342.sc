

def numberOfSteps(num: Int): Int = {
  var result: Int = 0
  def loop(nums: Int): Unit = {
    nums match {
      case x if x == 0 =>
      case x if x % 2 == 0  => result += 1; loop( x / 2)
      case x  => result += 1; loop( (x - 1))
    }
  }
  loop(num)
  result

}

numberOfSteps(10)


