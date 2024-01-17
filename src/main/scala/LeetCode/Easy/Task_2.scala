package LeetCode.Easy

object Task_2 extends App {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {

    var list1 = l1
    var list2 = l2

    var cur1: Int = 0
    var cur2: Int = 0

    var buff: Int = 0
    var result: Int = 0
    var listNode: ListNode = null
    var currentListNode: ListNode = null

    while(list1 != null || list2 != null){
      cur1 = 0
      cur2 = 0
      result = 0

      if (list1 != null ) {cur1 = list1.x; list1 = list1.next}
      if (list2 != null ) {cur2 = list2.x; list2 = list2.next}

      if ((cur1 + cur2)+buff >= 10) {
        result = (cur1 + cur2) - 10 + buff
        buff = 1
      }
      else {
        result = (cur1 + cur2) + buff
        buff = 0
      }

      val newNode = new ListNode(result, null)
      if (listNode == null) {
        listNode = newNode
        currentListNode = listNode
      } else {
        currentListNode.next = newNode
        currentListNode = newNode
      }


    }
    if (buff == 1) {
      val newNode = new ListNode(1, null)
      if (listNode == null) {
        listNode = newNode
      } else {
        currentListNode.next = newNode
      }
    }

    listNode
  }



  val t1: ListNode = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))))) ) )
  val t2: ListNode = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))))




  var currentNode = addTwoNumbers(t1, t2)

  while (currentNode != null) {
    println(currentNode.x)
    currentNode = currentNode.next
  }

}
