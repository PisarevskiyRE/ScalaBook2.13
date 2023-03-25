package Chapter22 {

  sealed abstract class List[+A] {
    def isEmpty: Boolean

    def head: A

    def tail: List[A]

    def length: Int = if (isEmpty) 0 else 1 + tail.length

    def drop(n: Int): List[A] = {
      if (isEmpty) Nil
      else if (n <= 0) this
      else tail.drop(n - 1)
    }

    def ::[B >: A](x: B): List[B] = new ::(x, this)

    def :::[B >: A](prefix: List[B]): List[B] =
      if (prefix.isEmpty) this
      else prefix.head :: prefix.tail ::: this

    def map[B](f: A => B): List[B] = {

      if (isEmpty) Nil
      else f(head) :: tail.map(f)
    }
  }


  case object Nil extends List[Nothing] {
    override def isEmpty: Boolean = true

    def head: Nothing = throw new NoSuchElementException("head of empty list")

    def tail: List[Nothing] = throw new NoSuchElementException("tail of empty list")
  }


  final case class ::[A](head: A, tail: List[A]) extends List[A] {
    def isEmpty: Boolean = false
  }
}