object Solution {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }


  def middleNode(head: ListNode): ListNode = {

    var end: ListNode = head
    var middle: ListNode = head

    while (end != null && end.next != null){
      middle = middle.next
      end = end.next.next
    }

    middle
  }


  val test: ListNode = new ListNode(3, new ListNode(1,  new ListNode(7,new ListNode(2,new ListNode(2,null)))))

  Solution.middleNode(test).toString
}


