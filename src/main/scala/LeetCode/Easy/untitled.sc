def searchTest(a: Array[Int], n: Int): Int = {

  var left = 0
  var right = a.length
  var ans: Int = -1


  while (left < right) {
    val mid = a.length / 2

    if (a(mid) < n) {
      left = mid
    } else if (a(mid) > n) {
      right = mid
    } else ans = mid

  }

  ans
}





searchTest(Array(3,4,5,6,7,8,9,10,11), 8)