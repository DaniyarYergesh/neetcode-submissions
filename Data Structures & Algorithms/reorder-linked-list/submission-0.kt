/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
     if (head == null || head.next == null) {
        return
    }
    var slow = head
    var fast = head
    while(slow != null && fast?.next != null) {
        slow = slow.next
        fast = fast?.next?.next
    }

    var second = slow?.next
    slow?.next = null
    var prev: ListNode? = null
    var curr = second
    while (curr != null) {
        var temp = curr.next
        curr.next = prev
        prev = curr
        curr = temp
    }

    var first = head
    var secondList = prev
    while (first != null && secondList != null) {
        val tmp1 = first.next
        val tmp2 = secondList.next
        first.next = secondList
        secondList.next = tmp1
        first = tmp1
        secondList = tmp2
    }
    }
}
