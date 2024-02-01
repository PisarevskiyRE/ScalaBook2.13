package LeetCode.Easy

object Task_37 extends App {

  def solveSudoku(board: Array[Array[Char]]): Unit = {

    def isValid(board: Array[Array[Char]], row: Int, col: Int, c: Char): Boolean = {

      (0 until 9).foreach(i => {
        if (board(i)(col) == c) return false
        if (board(row)(i) == c) return false
        if (board(3 * (row / 3) + i / 3)(3 * (col / 3) + i % 3) == c) return false
      })

      true
    }

    def solve(board: Array[Array[Char]], numRows: Int, numCols: Int): Boolean = {

      (0 until numRows).foreach(row => {
        (0 until numCols).foreach(col => {

          if (board(row)(col) == '.') {
            ('1' to '9').foreach(c => {

              if (isValid(board, row, col, c)) {
                board(row)(col) = c

                if (solve(board, numRows, numCols)) return true

                board(row)(col) = '.'
              }
            })
            return false
          }

        })
      })
      true

    }

    solve(board, 9, 9)



  }


}
