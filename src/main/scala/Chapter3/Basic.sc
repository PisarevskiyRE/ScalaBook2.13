import java.math.BigInteger

val bigInt = new BigInteger("12345")

val greetString = new Array[String](3)
greetString(0) = "Hello"
greetString(1) = ", "
greetString(2) = "word!\n"

for (i <- 0 to 2)
  print(greetString(i))


greetString(0) = "1"
greetString.update(0,"2")



val numNames = Array("zero", "one", "two")


