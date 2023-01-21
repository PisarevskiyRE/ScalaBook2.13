val someNumbers = List(1,2,3,4,5)

someNumbers.foreach(x => println(x))
someNumbers.foreach(println _)
someNumbers.foreach(println)

def sum(a: Int, b: Int, c: Int) = a + b + c
sum(1,2,3)

// частично примененная функция
val a = sum _

a(1,2,3)
// или
a.apply(1,2,3)

val b = sum(1, _:Int, 3)
b(2)
b(2)
b(5)
