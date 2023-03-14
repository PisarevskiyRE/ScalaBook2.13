class Publication(val title: String)
class Book(title: String) extends Publication(title)

object Library {
  val books: Set[Book] = Set(
    new Book("Programming in Scala"),
    new Book("Walden")
  )


  def printBookList(info: Book => AnyRef): Unit = {
    for (book <- books) println(info(book))
  }
}

def getTitle(p: Publication): String = p.title
Library.printBookList(getTitle)

//!!!376 перечитать



trait Animal
case class Dog(name: String) extends Animal

//ковариантный класс
class Covariant[+A](val value: A)

val dog: Dog = Dog("Rex")
val animal: Animal = dog

val covariantDog: Covariant[Dog] = new Covariant[Dog](dog)
val covariantAnimal: Covariant[Animal] = covariantDog

//контрвариантный класс
class Contravariant[-A](val value: A => String)

val animalToString: Animal => String = _.toString
val dogToString: Dog => String = _.toString

val contravariantAnimal: Contravariant[Animal] = new Contravariant[Animal](animalToString)
val contravariantDog: Contravariant[Dog] = contravariantAnimal