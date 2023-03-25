import scala.collection.mutable.ListBuffer


val xs = List(1,2,3,4)
val buf = new ListBuffer[Int]

for (x <- xs) buf += x + 1
buf.toList