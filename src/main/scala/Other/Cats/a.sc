//Параметрический полиморфизм
def head[A](xs: List[A]): A = xs(0)
head(1::2::Nil)
case class Car(make: String)
head(Car("Civic")::Car("Cr-V")::Nil)

//Полиморфизм подтипов
trait PlusIntf[A] {
  def plus(a2: A): A
}
def plusBySubtype[A <: PlusIntf[A]](a1: A, a2: A): A = a1.plus(a2)

//Ad-hoc polymorphism
trait CanPlus[A] {
  def plus(a1: A, a2: A): A
}
def plus[A: CanPlus](a1: A, a2: A): A = implicitly[CanPlus[A]].plus(a1,a2)