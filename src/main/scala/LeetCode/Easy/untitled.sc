def sortArrayInRange(arr: Array[Int], a: Int, b: Int): Array[Int] = {
  val sortedSlice = arr.slice(a, b + 1).sorted
  arr.patch(a, sortedSlice, sortedSlice.length)
}

// Пример использования:
val myArray = Array(9, 8, 7, 6, 5, 4, 3)
val sortedArray = sortArrayInRange(myArray, 2, 5)
println(sortedArray.mkString(", "))