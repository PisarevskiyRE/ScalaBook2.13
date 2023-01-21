
var more = 1
val addMore = (x: Int) => x + more
addMore(10)
more = 66
addMore(10)


val someNumbers = List(-11, -10, -5, 0, 5, 10)

var sum = 0

someNumbers.foreach(sum += _)

sum



def makeIncreaser(more: Int) = (x : Int) => x + more

val inc1 = makeIncreaser(1)
val inc99 = makeIncreaser(9999)

inc1(10)
inc99(10)

inc1(10)
inc99(10)