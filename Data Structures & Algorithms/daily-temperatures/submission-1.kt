class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
   val stack = Stack<Int>()
    val result = IntArray(temperatures.size) { 0 }
    for (i in temperatures.indices) {
        while (stack.isNotEmpty() && temperatures[stack.peek()] < temperatures[i]) {
            val index = stack.pop()
            result[index] = i - index
        }
        stack.push(i)
    }
    return result
    }
}
