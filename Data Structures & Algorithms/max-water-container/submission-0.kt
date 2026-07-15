class Solution {
    fun maxArea(heights: IntArray): Int {
  var max = 0
    var i = 0
    var j = heights.size - 1
    while (i < j) {
        max = maxOf(max, min(heights[i], heights[j]) * (j - i))
        if (heights[j] < heights[i]) j--
        else i++
    }
    return max
    }
}
