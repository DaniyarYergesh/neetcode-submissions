class Solution {
    fun search(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.size - 1

    while (l <= r) {
        val m = l + (r - l) / 2

        if (nums[l] <= nums[m]) {
            if (target !in nums[l]..nums[m]){
                l = m + 1
                continue
            }
            if (nums[m] < target) {
                l = m + 1
            } else if (nums[m] > target) {
                r = m - 1
            } else {
                return m
            }
        } else if (target in nums[m]..nums[r]) {
            l = m
        } else {r = m}
    }
    return -1
    }
}
