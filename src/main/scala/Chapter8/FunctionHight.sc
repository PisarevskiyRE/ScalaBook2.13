val inc = (x: Int) => {var y = x + 1; y = y + 2; y}
inc(10)


val someNumbers = List(1,2,3,4,5)

someNumbers.foreach((x: Int) => println(x))

someNumbers.filter((x: Int) => x > 2)
someNumbers.filter((x) => x > 2)
someNumbers.filter(x => x > 2)
someNumbers.filter(_ > 2)



val f = (_:Int) + (_:Int)
f(5,10)