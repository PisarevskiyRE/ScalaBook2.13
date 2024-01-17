package LeetCode.Easy

/*
* class Solution {
    public String longestPalindrome(String s) {
        for (int length = s.length(); length > 0; length--) {
            for (int start = 0; start <= s.length() - length; start++) {
                if (check(start, start + length, s)) {
                    return s.substring(start, start + length);
                }
            }
        }

        return "";
    }

    private boolean check(int i, int j, String s) {
        int left = i;
        int right = j - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
*
* */
object Task_5 extends App {
  def longestPalindrome(s: String): String= {


    if (s.length == 1 ) return s
    if (s.length == 2 && s(0) == s(1)) return s
    if (s.length == 2 && s(0) != s(1)) return s(0).toString


    def check(i: Int, j: Int, in: String): Boolean = {
      var localI: Int = i
      var localJ: Int = j - 1

      while (localI < localJ) {
        if (in(localI) != in(localJ)) return false
        localI += 1
        localJ -= 1
      }
      true
    }

    val result = (- s.length until 0).map( x=>
      (0 to s.length - x.abs).map( y=>
        if ( check(y,(y+x.abs), s )) return s.substring(y,(y+x.abs))
      )
    )

//    if (result.length == 0) s(0).toString
//    else result
    ""
  }

  println(
    longestPalindrome("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc")
  )


}
