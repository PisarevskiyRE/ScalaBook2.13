class Rational(n: Int, d: Int) {
  require(d != 0)


  private val g = gcd(n.abs, d.abs)
  val number: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n,1)

  def + (that: Rational): Rational =
    new Rational(
      number * that.denom + that.number * denom,
      denom * that.denom
    )

  def + (i: Int): Rational =
    new Rational(number + i * denom, denom)

  def - (that: Rational): Rational =
    new Rational(
      number * that.denom - that.number * denom,
      denom * that.denom
    )

  def - (i: Int): Rational =
    new Rational(number - i * denom, denom)

  def * (that:Rational): Rational =
    new Rational(number * that.denom, denom * that.denom)

  def * (i: Int): Rational =
    new Rational(number * i, denom)

  def / (that: Rational): Rational =
    new Rational(number * that.denom, denom * that.number)

  def / (i: Int): Rational =
    new Rational(number, denom * i)

  def lessThan(that: Rational) =
    this.number * that.denom < that.number * this.denom

  def max(that: Rational) =
    if (this.lessThan(that)) that else this


  override def toString: String = s"$number/$denom"

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) {
    //  println(a);
      a
    }
    else {
    //  println(b.toString + " - " + (a % b).toString)
      gcd(b, a % b)
    }
}


val r1 = new Rational(1,4)
val r2 = new Rational(3,4)


r1 + r2

r1 lessThan r2
r2 lessThan r1

r1 * 2

implicit def intToRational(x: Int) = new Rational(x)
2 * r1

//new Rational(66,42)
//new Rational(121,11)
//new Rational(27,3)
//new Rational(27,3) + 2





