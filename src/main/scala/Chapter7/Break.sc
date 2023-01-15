import java.io.{BufferedReader, InputStreamReader}
import scala.util.control.Breaks._

val in = new BufferedReader(new InputStreamReader(System.in))

breakable{
  while (true) {
    println("? ")
    if (in.readLine() == "") break
  }
}