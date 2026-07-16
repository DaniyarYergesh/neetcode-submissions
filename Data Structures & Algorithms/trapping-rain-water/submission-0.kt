class Solution {
    fun trap(height: IntArray): Int {
    val prefixes = hashMapOf<Int, Int>()
    val suffixes = hashMapOf<Int, Int>()

    var maxPrefix = 0
    for (i in height.indices) {
        maxPrefix = maxOf(height[i], maxPrefix)
        prefixes[i] = maxPrefix
    }

    var maxSuffix = 0
    for (i in height.size - 1 downTo 0) {
        maxSuffix = maxOf(height[i], maxSuffix)
        suffixes[i] = maxSuffix
    }

    var area = 0
    for (i in height.indices) {
        val currentArea = minOf(prefixes.getOrDefault(i, 0), suffixes.getOrDefault(i, 0)) - height[i]
        area += currentArea
    }
    return area
    }
}
