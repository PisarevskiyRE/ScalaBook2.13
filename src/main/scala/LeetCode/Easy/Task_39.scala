package LeetCode.Easy

object Task_39 extends App{

  import scala.collection.mutable

  def solutions(candidates: Array[Int], target: Int, results: mutable.ListBuffer[List[Int]], acc: List[Int]): Unit = {
    if (target == 0) {
      results += acc
    } else if (target > 0) {
      candidates.filter(elem => elem <= target && elem >= acc.lastOption.getOrElse(Int.MinValue)).foreach { elem =>
        solutions(candidates, target - elem, results, acc :+ elem)
      }
    }
  }

  def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {
    val results = new mutable.ListBuffer[List[Int]]
    solutions(candidates, target, results, List())
    results.toList
  }

}
