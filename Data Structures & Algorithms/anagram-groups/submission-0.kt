class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hashMap = hashMapOf<String, MutableList<String>>()

        for (str in strs) {
            val ints = IntArray(26)
                for (substring in str) {
                    ints[substring - 'a']++
                }
            val key = ints.joinToString(",")

        
    hashMap.getOrPut(key) { mutableListOf() }.add(str)
            }
        return hashMap.values.map { it.toList() }
    }
}
