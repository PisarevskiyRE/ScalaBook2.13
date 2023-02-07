import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
  def get(): Int
  def put(x: Int): Unit
}


trait Doubling extends IntQueue {
  abstract override def put(x: Int): Unit = { super.put(2 * x)  }
}

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) = { super.put(x + 1) }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) = {
    if (x >= 0) super.put(x)
  }
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) = {buf += x}
}


class MyQueue extends BasicIntQueue with Doubling




val queue = new BasicIntQueue
queue.put(10)
queue.put(20)
queue.get()
queue.get()


val queue2 = new MyQueue
queue2.put(10)
queue2.put(20)
queue2.get()
queue2.get()

val queue3 = (new BasicIntQueue
  with Incrementing with Filtering)

queue3.put(-1)
queue3.put(0)
queue3.put(1)
queue3.get()
queue3.get()