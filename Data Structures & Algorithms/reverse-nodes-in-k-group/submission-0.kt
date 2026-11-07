/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
  val dummy = ListNode(0)
    dummy.next = head

    var groupPrev = dummy

    while (true) {
        var kth = groupPrev
        repeat(k) {
            kth = kth.next ?: return dummy.next
        }
        val groupNext = kth.next

        var prev = groupNext
        var curr = groupPrev.next

        while (curr != groupNext) {
            val next = curr!!.next
            curr.next = prev
            prev = curr
            curr = next
        }

        val oldGroupStart = groupPrev.next
        groupPrev.next = kth
        groupPrev = oldGroupStart!!
    }
    return dummy.next
    }
}
