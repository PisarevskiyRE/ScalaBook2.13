package LeetCode.Easy

object Task_28 extends App {

  def strStr(haystack: String, needle: String): Int = {
   var result: Int = -1

    if (haystack.length < needle.length) return result

    (0 until  haystack.length).foreach( x => {
      if (haystack(x) == needle(0)){

        result = x

        (0 until needle.length).foreach( y => {

          if (x+y >= haystack.length ) result = -1

          if ( x+y < haystack.length &&   haystack(x + y) != needle(y)) {
            result = -1
          }


          if (y == needle.length-1 && result >= 0) return result
        })

      }
    })
    result
  }


  println(strStr("mississippi","issipi"))

}
