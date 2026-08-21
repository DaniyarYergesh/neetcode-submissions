class Solution {
    fun search(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.size - 1
    while (l <= r) {
        val guess = l + (r - l) / 2

        when {
            nums[guess] > target -> r = guess - 1
            nums[guess] < target -> l = guess + 1
            else -> return guess
        }   
    }

    return -1
    }
}
