import scala.collection.mutable._
import collection.JavaConverters._


val jul: java.util.List[Int] = ArrayBuffer(1,2,3).asJava.asScala.asJava

val buf: Seq[Int] = jul.asScala