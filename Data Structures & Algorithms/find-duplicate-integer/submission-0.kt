class Solution {
    fun findDuplicate(nums: IntArray): Int {
   val set = hashSetOf<Int>()

    for (num in nums) {
        if (num in set) {
            return num
        }
        set.add(num)
    }
    return -1
    }
}
