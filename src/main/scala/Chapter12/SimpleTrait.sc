trait Philosophical {
  def philosophize() = {
    println("На меня тратят память, следовательно, я существую!")
  }
}


class Animal

trait HasLegs

class Frog extends Animal with Philosophical {
  override def toString: String = "зеленая"

  override def philosophize(): Unit = {
    println("Мне живется нелегко, потому что я "+ toString + "!")
  }
}



val phrog: Philosophical = new Frog

phrog.philosophize()

