class TimeMap() {
   val map = mutableMapOf<String, MutableList<Pair<String, Int>>>()

    fun set(key: String, value: String, timestamp: Int) {
        map[key] = map.getOrDefault(key, mutableListOf()).apply { add(value to timestamp) }
    }

    fun get(key: String, timestamp: Int): String {
        var res = ""
        val list = map[key].orEmpty().toMutableList()
        var l = 0
        var r = list.size - 1
        while (l <= r) {
            val mid = (r + l) / 2

            if (list[mid].second <= timestamp) {
                res = list[mid].first
                l = mid + 1
            } else r = mid -1
        }

        return res
    }
}
