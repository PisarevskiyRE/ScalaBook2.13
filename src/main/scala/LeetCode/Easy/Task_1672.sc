object Solution {
  def maximumWealth(accounts: Array[Array[Int]]): Int = {

    var result: Int = 0

    accounts.map( x =>
      x.sum
    ).map( x =>
      result = math.max(result,x)
    )

    result
  }
}


Solution.maximumWealth(Array(Array(2,8,7),Array(7,1,3),Array(1,9,5)))