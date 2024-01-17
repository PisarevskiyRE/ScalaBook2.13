val s = "absdrrr"


//    for (int length = s.length(); length > 0; length--) {
//      for (int start = 0; start <= s.length() - length; start++) {
//        if (check(start, start + length, s)) {
//          return s.substring(start, start + length);
//        }
//      }
//    }


(- s.length until 0).map( x=>
  (0 to s.length - x.abs).map( y=>

    println(y.toString +"/"+(y+x.abs).toString)

  )
)

