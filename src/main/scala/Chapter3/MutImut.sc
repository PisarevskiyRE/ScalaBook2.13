var jetSet = Set("1","2")
jetSet += "3"
jetSet.map(println)


val jetSet2 = scala.collection.mutable.Set("1","2")
jetSet2 += "3"
jetSet2.map(println)


import scala.collection.mutable
val treasureMap = mutable.Map[Int,String]()
treasureMap += (1 -> "1")
treasureMap += (2 -> "2")
treasureMap += (3 -> "3")
treasureMap += (4 -> "4")

println(treasureMap(2))