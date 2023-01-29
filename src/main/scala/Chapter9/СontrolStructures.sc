import java.io.PrintWriter
import java.io.File
import java.util.Date

def twice(op: Double => Double, x: Double) = op(op(x))
twice(_ + 1, 5 )




def withPrintWriter(file: File)(op: PrintWriter => Unit) = {
  val writer = new PrintWriter(file)

  try {
    op(writer)
  } finally {
    writer.close
  }
}



val file = new File("date.txt")

withPrintWriter(file){
  writer => writer.println(new Date())
}


