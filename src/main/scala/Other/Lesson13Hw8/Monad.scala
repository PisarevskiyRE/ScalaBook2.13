package Other.Lesson13Hw8

trait Monad[F[_]] extends Functor[F] { self =>

  def map[A, B](fa: F[A])(f: A => B): F[B] = flatMap(fa)(a => point(f(a)))
  def flatMap[A, B](fa: F[A])(f: A => F[B]): F[B]

  def point[A](a: A): F[A]

  def flatten[A](fa: F[F[A]]): F[A] = flatMap(fa)(f => f)
}

object Monad {
  def apply[F[_]](implicit ev: Monad[F]): Monad[F] = ev

  implicit def monadOption: Monad[Option] = new Monad[Option] {
    def flatMap[A, B](fa: Option[A])(f: A => Option[B]): Option[B] = fa.flatMap(f)

    def point[A](a: A): Option[A] = Option(a)
  }

  implicit def monadList: Monad[List] = new Monad[List] {
    def flatMap[A, B](fa: List[A])(f: A => List[B]): List[B] = fa.flatMap(f)

    def point[A](a: A): List[A] = List(a)
  }

  implicit def monadSet: Monad[Set] = new Monad[Set] {
    def flatMap[A, B](fa: Set[A])(f: A => Set[B]): Set[B] = fa.flatMap(f)

    def point[A](a: A): Set[A] = Set(a)
  }
}
