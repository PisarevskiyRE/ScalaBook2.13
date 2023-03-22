case class PreferredPrompt(val preference: String)
case class PreferredDrink(val preference: String)

object Greeter {
  def greet(name: String)(implicit prompt: PreferredPrompt,
                          drink: PreferredDrink): Unit = {
    println("Welcome, " + name + ". The system is ready.")
    print("But while you work, ")
    println("why not enjoy a cup of " + drink.preference + "?")
    println(prompt.preference)
  }
}

implicit val bobsPrompt: PreferredPrompt = PreferredPrompt.apply("relax> ")
implicit val drink = new PreferredDrink("tea")

Greeter.greet("Bob")(bobsPrompt, drink)

def maxListOrderiong[T](elements: List[T])
                       (implicit ordering: Ordering[T]): T =
  elements match {
    case List() => throw  new IllegalArgumentException("Empty List!")
    case List(x) => x
    case x::rest =>
      val maxRest = maxListOrderiong(rest)
      if (ordering.gt(x, maxRest)) x
      else maxRest
  }


maxListOrderiong(List.apply(1,5,10,3))
maxListOrderiong(List.apply(1.5, 5.2, 10.7, 3.14159))

maxListOrderiong(List.apply("one", "two", "three"))

// implicitly

//def implicitly[T](implicit e: T): T = e

def maxList[T](elements: List[T])
              (implicit ordering: Ordering[T]): T =
  elements match {
    case List() => throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: rest =>
      val maxRest = maxList(rest)
      if (implicitly[Ordering[T]].gt(x, maxRest)) x
      else maxRest
  }




