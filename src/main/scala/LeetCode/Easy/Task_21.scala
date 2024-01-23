package LeetCode.Easy

object Task_21 extends App{
  class ListNode(_x: Int = 0, _next: ListNode = null) {
       var next: ListNode = _next
       var x: Int = _x
  }


  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {

    list1
  }


  println(
    mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4, null))), new ListNode(1, new ListNode(3, new ListNode(4, null))))
  )
}
