class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    nums.sort()

    for (i in 0  until nums.size - 2) {
        val target = nums[i]
        if (target > 0) break

        if (i > 0 && target == nums[i - 1]) continue

        var j = i + 1
        var k = nums.size - 1

        while (j < k) {
            val threeSum = target + nums[j] + nums[k]
            if (threeSum == 0) {
                result.add(listOf(nums[i], nums[j], nums[k]))
                j++
                k--

                while (j < k && nums[j] == nums[j - 1]) {
                    j ++
                }
            } else if (threeSum > 0) k--
             else if (threeSum < 0) j++

        }
    }
    return result
    }
}
