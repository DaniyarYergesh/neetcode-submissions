class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i = 0
        var k = numbers.size - 1
        while (i < k) {
            if (numbers[i] + numbers[k] == target) {
                return intArrayOf(i + 1, k + 1)
            } else if (numbers[i] + numbers[k] > target) {k--
            } else if (numbers[i] + numbers[k] < target){i++}
    }
    return intArrayOf()
    }
}
