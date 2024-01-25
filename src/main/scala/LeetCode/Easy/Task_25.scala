package LeetCode.Easy

object Task_25 extends App {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }


  def reverseKGroup(head: ListNode, k: Int): ListNode = {

    var length = 0
    var node = head
    while (node != null) {
      length += 1
      node = node.next
    }

    val dummy = new ListNode(0, head)
    var groupPrev = dummy

    while (length >= k){

      var curr = groupPrev.next
      var groupNext = curr
      for (_ <- 0 until k) {
        val nextNode = curr.next
        curr.next = groupPrev.next
        groupPrev.next = curr
        curr = nextNode
      }
      groupNext.next = curr
      groupPrev = groupNext
      length -= k
    }
    dummy.next
  }




  var exemple = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))))

  val result = reverseKGroup(exemple, 2)

  while (exemple != null){
    println(exemple.x)

    exemple = exemple.next
  }


}
