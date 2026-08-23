class Solution {
    fun search(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.size - 1

    while (l <= r) {
        val m = l + (r - l) / 2
        if (target == nums[m]) return m

        //left sorted portion
        if (nums[l] <= nums[m]) {
            if (nums[m] < target || target < nums[l]) {
                l = m + 1
            } else {
                r = m - 1
            }
        }
        //right sorted portion
        else {
            if (nums[r] < target || target < nums[m]) {
                r = m - 1
            } else {
                l = m + 1
            }
        }
    }
    return -1
    }
}
