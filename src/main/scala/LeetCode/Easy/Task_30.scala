package LeetCode.Easy

import scala.collection.mutable

object Task_30 extends App {

  def findSubstring(s: String, words: Array[String]): List[Int] = {

    var res = List[Int]()

    val wordMap = mutable.Map[String, Int]()
    val len: Int = words(0).length
    val n: Int = s.length
    val m: Int = words.length


    words.foreach( x => {
      wordMap.put(x, wordMap.getOrElse(x,0) + 1 )
    })


    (0 until len).foreach( i => {
      var cnt = 0
      val copy = wordMap

      (i to (n - len)).by(len).foreach( j => {
        val cur = s.substring(j,j+len)




        copy.update(cur, wordMap.getOrElse(cur,0) - 1 )

        println(copy)

        if (copy(cur) >= 0) cnt += 1


        val pop_start = j - (m * len)

        if (pop_start >= 0) {
          val pop_word = s.substring(pop_start, j + len)

          copy.put(pop_word, copy.getOrElse(pop_word,0) + 1 )

          if (copy(pop_word) > 0) cnt -= 1

        }

        if (cnt == m) {
          res.appended(pop_start + len)
        }

      })
    })


    res
  }


  println(findSubstring("barfoofoobarthefoobarman", Array("bar","foo","the")))

}
