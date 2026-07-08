class Solution {
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val hashMap = hashMapOf<Int, Int>()
    for (num in nums) {
        hashMap[num] = hashMap.getOrDefault(num, 0) + 1
    }
    return hashMap.entries.sortedByDescending { it.value }.take(k).map { it.key }.toIntArray()
}
}
