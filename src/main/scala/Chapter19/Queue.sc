trait Queue[+T] {
  def head: T
  def tail: Queue[T]
  def enqueue[U >: T](x: U): Queue[U]
}

/*
object Queue {
  def apply[T](xs: T*): Queue[T] = new QueueImpl[T](xs.toList, Nil)

  private class QueueImpl[+T]( private val leading: List[T],
                              private val trailing: List[T])
    extends Queue[T] {

    def mirror = {
      if (leading.isEmpty)
        new QueueImpl(trailing.reverse, Nil)
      else
        this
    }

    def head: T = mirror.leading.head

    def tail: QueueImpl[T] = {
      val q = mirror
      new QueueImpl(q.leading.tail, q.trailing)
    }

    def enqueue[U >: T](x: U) =
      new QueueImpl(leading, x :: trailing)
  }
}

class StrangeIntQueue extends Queue[Int]{
  override def enqueue[U >: Int](x: U): Queue[U] =
    println(math.sqrt(x))
    super.enqueue(x)
}
*/

class Queue[+T] private (
                          private[this] var leading: List[T],
                          private[this] var trailing: List[T]
                        )
{
  private def mirror() =
    if (leading.isEmpty) {
      while (!trailing.isEmpty) {
        leading = trailing.head :: leading
        trailing = trailing.tail
      }
    }
  def head: T = {
    mirror()
    leading.head
  }
  def tail: Queue[T] = {
    mirror()
    new Queue(leading.tail, trailing)
  }
  def enqueue[U >: T](x: U) =
    new Queue[U](leading, x :: trailing)
}