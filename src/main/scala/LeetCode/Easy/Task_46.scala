package LeetCode.Easy

object Task_46 extends App {

  import scala.annotation.tailrec
  implicit class InsertableList[A](l: List[A]){
    def insert(idx: Int, v: A) = {
      val (front, back) = l.splitAt(idx)
      front ++ List(v) ++ back
    }
  }
  def permute(nums: Array[Int]): List[List[Int]] = {
    @tailrec def loop(rem: List[Int], res: List[List[Int]] = List.empty): List[List[Int]] = rem match {
      case Nil => res
      case h :: t => res match {
        case h2 :: _ =>
          loop(t, (0 to h2.size).flatMap(i => res.map(c => c.insert(i,h))).toList)
        case Nil => loop(t, List(List(h)))
      }
    }
    loop(nums.toList)
  }


  val test = Array(1,2,3)


  permute(test).foreach(println)


}
