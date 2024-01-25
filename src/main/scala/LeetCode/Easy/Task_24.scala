package LeetCode.Easy

object Task_24 extends App {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }
  def swapPairs(head: ListNode): ListNode = {
    val dummy = new ListNode(0, head)
    var node = dummy

    while (node.next != null && node.next.next != null){
      val first = node.next
      val second = node.next.next
      val third = node.next.next.next

      second.next = first
      first.next = third
      node.next = second
      node = first
    }

    dummy.next
  }

  swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null)))))



}
