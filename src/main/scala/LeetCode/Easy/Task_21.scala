package LeetCode.Easy

object Task_21 extends App{
  class ListNode(_x: Int = 0, _next: ListNode = null) {
       var next: ListNode = _next
       var x: Int = _x
  }


  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {

    def loop(a: ListNode, b: ListNode, ab: ListNode = new ListNode()): Unit =
      (a, b) match {
        case (null, null) => ab
        case (i, null) => ab.next = i; ab
        case (null, j) => ab.next = j; ab
        case (i, j) =>
          if (i.x < j.x) {
            ab.next = i
            loop(i.next, j, ab.next)
          } else {
            ab.next = j
            loop(i, j.next, ab.next)
          }
      }


    if (list1 == null) list2
    else if (list2 == null) list1
    else {
      val mergedList = new ListNode()
      loop(list1, list2, mergedList)
      mergedList.next
    }
  }


//  def mergeTwoLists2(list1: ListNode, list2: ListNode): ListNode = {
//    def merge(a: ListNode, b: ListNode, merged: ListNode): ListNode = {
//      if (a == null) {
//        merged.next = b
//        merged
//      } else if (b == null) {
//        merged.next = a
//        merged
//      } else {
//        if (a.x < b.x) {
//          merged.next = a
//          merge(a.next, b, merged.next)
//        } else {
//          merged.next = b
//          merge(a, b.next, merged.next)
//        }
//      }
//    }
//
//    if (list1 == null) list2
//    else if (list2 == null) list1
//    else {
//      val mergedList = new ListNode()
//      merge(list1, list2, mergedList)
//      mergedList.next
//    }
//  }


  var t =  mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4, null))), new ListNode(1, new ListNode(3, new ListNode(4, null))))

  while(t != null) {
    println(t.x)
    t = t.next
  }


}
