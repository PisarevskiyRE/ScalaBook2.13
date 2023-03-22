case class Rectangle(width: Int, height: Int)

// только один параметр конструктора
implicit class RectangleMaker(width: Int){
  def x(height: Int) =  Rectangle(width, height)
}


4 x 5