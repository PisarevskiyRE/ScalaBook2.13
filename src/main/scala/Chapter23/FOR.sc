object Demo {

  def map[A,B](xs: List[A], f: A=> B): List[B] =
    for {
      x <- xs
    } yield f(x)
  def flatMap[A, B](xs: List[A], f: A => List[B]): List[B] =
    for {
      x <- xs
      y <- f(x)
    } yield y
  def filter[A](xs: List[A], f: A=> Boolean): List[A] =
    for {
      x <- xs if f(x)
    } yield x

}


abstract class C[A] {
  def map[B](f: A=>B): C[B]
  def flatMap[B](f: A => C[B]): C[B]
  def withFilter(p: A=> Boolean): C[A]
  def foreach(b: A => Unit): Unit
}
