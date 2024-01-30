package LeetCode.Easy

import scala.Array.ofDim

object Task_35 extends App {

  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val iWasDigit = ofDim[Boolean](9,9)
    val jWasDigit = ofDim[Boolean](9,9)
    val ijWasDigit = ofDim[Boolean](3,3,9)

    (0 until 9).foreach( i=>{
      (0 until 9).foreach(j => {
        val c: Char = board(i)(j)

        if (c != '.'){

          val d = c - '1'

          if (iWasDigit(i)(d)) return false

          iWasDigit(i)(d) = true

          if (jWasDigit(j)(d)) return false

          jWasDigit(j)(d) = true

          if (ijWasDigit(i/3)(j/3)(d)) return false

          ijWasDigit(i/3)(j/3)(d) = true

        }
      })
    })
    true
  }



  println(
    isValidSudoku(
      Array(
        Array('5','3','.','.','7','.','.','.','.'),
        Array('6','.','.','1','9','5','.','.','.'),
        Array('.','9','8','.','.','.','.','6','.'),
        Array('8','.','.','.','6','.','.','.','3'),
        Array('4','.','.','8','.','3','.','.','1'),
        Array('7','.','.','.','2','.','.','.','6'),
        Array('.','6','.','.','.','.','2','8','.'),
        Array('.','.','.','4','1','9','.','.','5'),
        Array('.','.','.','.','8','.','.','7','9'),
      )
    )
  )
}
