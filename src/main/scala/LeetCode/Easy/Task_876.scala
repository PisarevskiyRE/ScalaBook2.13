package LeetCode.Easy




object Task_876 extends App{

  case class ListNode(_x: Int = 0, _next: ListNode = null) {
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

  middleNode(ListNode(3, ListNode(1,ListNode(7,ListNode(2,ListNode(2,null)))))).toString
}
