

class LRUCache(private val capacity: Int) {

    private class Node(
        val key: Int,
        var value: Int
    ) {
        var prev: Node? = null
        var next: Node? = null
    }

    private val cache = HashMap<Int, Node>()
    private val head = Node(0,0)
    private val tail = Node(0,0)

    init {
        head.next = tail
        tail.prev = head
    }

    private fun remove(node: Node) {
        val prev = node.prev!!
        val next = node.next!!

        prev.next = next
        next.prev = prev
    }

    private fun insert(node: Node) {
        val last = tail.prev!!

        last.next = node
        node.prev = last

        node.next = tail
        tail.prev = node
    }

    fun get(key: Int): Int {
        val node = cache[key] ?: return -1

        remove(node)
        insert(node)
        
        return node.value
    }

    fun put(key: Int, value: Int) {
         val existing = cache[key]

        if (existing != null) {
            existing.value = value
            remove(existing)
            insert(existing)
            return
        }

        val node = Node(key, value)
        cache[key] = node
        insert(node)

       if (cache.size > capacity) {
            val lru = head.next!!
            remove(lru)
            cache.remove(lru.key)
        }
    }
}
