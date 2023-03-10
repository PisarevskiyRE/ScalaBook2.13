//def sum(xs: List[Int]): Int = xs.foldLeft(0)(_+_)
//sum(List(1,2,3,4))
//
//object IntMonoid {
//  def mappend(a: Int, b: Int): Int = a + b
//  def mzero: Int = 0
//}
//
//def sum2(xs: List[Int]): Int = xs.foldLeft(IntMonoid.mzero)(IntMonoid.mappend)
//sum2(List(1,2,3,4))


trait Monoid[A] {
  def mappend(a1:A , a2: A): A
  def mzero: A
}

object Monoid {
  implicit val IntMonoid: Monoid[Int] = new Monoid[Int] {
    def mappend(a: Int, b: Int): Int = a + b

    def mzero: Int = 0
  }

  implicit val StringMonoid: Monoid[String] = new Monoid[String] {
    def mappend(a: String, b: String): String = a + b

    def mzero: String = ""
  }
}

//def sum(xs: List[Int], m: Monoid[Int]): Int = xs.foldLeft(m.mzero)(m.mappend)
//sum(List(1,2,3,4), IntMonoid)
//
//def sum2[A](xs: List[A], m: Monoid[A]): A = xs.foldLeft(m.mzero)(m.mappend)
//sum(List(1,2,3,4), IntMonoid)


def sum3[A: Monoid](xs: List[A]): A = {
  val m = implicitly[Monoid[A]]
  xs.foldLeft(m.mzero)(m.mappend)

}


sum3(List(1, 2, 3, 4))
sum3(List("1", "2", "3", "4"))

