package Other.Lesson13Hw8

trait Order[A] {
  def compare(x: A, y: A): Option[Boolean]
}


