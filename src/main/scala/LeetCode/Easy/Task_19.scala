package LeetCode.Easy

object Task_19 extends App {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }



  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {

    var firstNode = head
    var lastNode = head

    (1 to n).foreach( x=> {
      lastNode = lastNode.next
    })

    if (lastNode == null) return head.next
    while (lastNode.next != null){
      firstNode = firstNode.next
      lastNode = lastNode.next
    }

    firstNode.next = firstNode.next.next

    head
  }




  println(
    removeNthFromEnd(
       new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null))))),
      2)
  )

}


/*class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}*/