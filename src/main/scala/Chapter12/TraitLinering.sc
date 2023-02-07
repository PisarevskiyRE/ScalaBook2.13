class Animal
trait Furry extends Animal
trait HasLegs extends Animal
trait FourLegs extends HasLegs
class Cat extends Animal with Furry with FourLegs


// Animal -> AnyRef -> Any

// Furry -> Animal -> AnyRef -> Any

// FourLegs -> HasLegs -> Furry -> Animal -> AnyRef -> Any

// Cat -> FourLegs -> HasLegs -> Furry -> Animal -> AnyRef -> Any