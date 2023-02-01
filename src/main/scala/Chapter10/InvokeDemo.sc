abstract class Element{
  def demo() = {
    println("Вызвана реализация, определенная в Element")
  }
}

class ArrayElement extends Element {
  override def demo() = {
    println("Вызвана реализация, определенная в ArrayElement")
  }
}

class LineElement extends ArrayElement{
  override def demo() = {
    println("Вызвана реализация, определенная в LineElement")
  }
}

class UniformElement extends Element

def invokeDemo(e: Element) ={
  e.demo()
}

val e1: Element = new ArrayElement()
val ae: ArrayElement = new LineElement()
val e2: Element = ae
val e3: Element = new UniformElement()


invokeDemo(e1)
invokeDemo(ae)
invokeDemo(e2)
invokeDemo(e3)
