class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
    val stack = Stack<Pair<Int, Int>>()
    var max = 0

    for (currentHeight in heights.withIndex()) {
        var start = currentHeight.index
        while (stack.isNotEmpty() && stack.peek().second > currentHeight.value) {
            val (indexOfLeft, height) = stack.pop()
            max = max(max, height * (currentHeight.index - indexOfLeft) )
            start = indexOfLeft
        }
        stack.push(start to currentHeight.value)
    }

    for (i in stack) {
        max = max(max, i.second * (heights.size - i.first))
    }

    return max
    }
}
