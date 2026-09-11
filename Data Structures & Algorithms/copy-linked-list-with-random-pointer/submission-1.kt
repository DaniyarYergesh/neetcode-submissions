/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {
        val oldToCopy = hashMapOf<Node?, Node?>(null to null)

        var cur = head
        while(cur != null){
            val copy = Node(cur.`val`)
            oldToCopy[cur] = copy
            cur = cur.next
        }

        cur = head
        while (cur != null){
            val copy = oldToCopy[cur]
            copy?.next = oldToCopy[cur.next]
            copy?.random = oldToCopy[cur.random]
            cur = cur.next
        }

        return oldToCopy[head]
    }
}
