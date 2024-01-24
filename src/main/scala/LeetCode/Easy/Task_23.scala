package LeetCode.Easy

object Task_23 extends App {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }


  def mergeKLists(lists: Array[ListNode]): ListNode = {

    def merge(l1: ListNode, l2: ListNode): ListNode = {
      def loop(a: ListNode, b: ListNode, agg: ListNode): Unit = {
        (a, b) match {
          case (null, null) =>
          case (i, null) => agg.next = i
          case (null, j) => agg.next = j
          case (i, j ) => {
            if (i.x <= j.x) {
              agg.next = i
              loop(i.next, j, agg.next)
            } else {
              agg.next = j
              loop(i,j.next, agg.next)
            }
          }
        }
      }

      val result = new ListNode()
      loop(l1,l2,result)
      result.next
    }



    def reduce(lists: Array[ListNode]): ListNode = {
      val reduced :Array[ListNode]= lists.grouped(2).flatMap {
        case x if x.size == 2 => List(merge(x(0), x(1)))
        case x => x
      }.toArray
      if(reduced.size==0) null
      else if(reduced.size==1)reduced.head
      else reduce(reduced)
    }

    reduce(lists)
  }




  var t = mergeKLists(
      Array(
            new ListNode(),
            new ListNode(-1, new ListNode(5, new ListNode(11, null ))),
            new ListNode(),
            new ListNode(6, new ListNode(10, null))
      )



  )

  while(t != null) {
    println(t.x)
    t = t.next
  }


}
