class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
  def merge(a: ListNode, b: ListNode, merged: ListNode): ListNode = (a, b) match {
    case (null, null) => merged
    case (i, null) =>
      merged.next = i
      merged
    case (null, j) =>
      merged.next = j
      merged
    case (i, j) =>
      if (i.x < j.x) {
        merged.next = i
        merge(i.next, j, merged.next)
      } else {
        merged.next = j
        merge(i, j.next, merged.next)
      }
  }

  if (list1 == null) list2
  else if (list2 == null) list1
  else {
    val mergedList = new ListNode()
    merge(list1, list2, mergedList)
    mergedList.next
  }
}


var t =   mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4, null))), new ListNode(1, new ListNode(3, new ListNode(4, null))))

while(t != null) {
  println(t.x)
  t = t.next
}