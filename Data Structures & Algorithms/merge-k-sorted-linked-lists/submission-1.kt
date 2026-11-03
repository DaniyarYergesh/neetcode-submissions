/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    if (lists.isEmpty()) return null

    var currentLists = lists.toList()
    while (currentLists.size > 1) {
        val mergedLists = mutableListOf<ListNode?>()
        for (i in currentLists.indices step 2) {
            val l1 = currentLists[i]
            val l2 = if (i + 1 < currentLists.size) currentLists[i + 1] else null
            mergedLists.add(mergeList(l1, l2))
        }
        currentLists = mergedLists
    }
    return currentLists[0]
}

private fun mergeList(l1: ListNode?, l2: ListNode?): ListNode? {
    val dummy = ListNode(0)
    var tail = dummy
    var list1 = l1
    var list2 = l2

    while (list1 != null && list2 != null) {
        if (list1.`val` < list2.`val`) {
            tail.next = list1
            list1 = list1.next
        } else {
            tail.next = list2
            list2 = list2.next
        }
        tail = tail.next!!
    }

    tail.next = list1 ?: list2
    
    return dummy.next
}
}
