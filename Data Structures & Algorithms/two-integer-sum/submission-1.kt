class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = hashMapOf<Int, Int>()
        for (i in nums.indices) {
          val difference = target - nums[i]
          if (difference in hashMap.keys) { return intArrayOf(hashMap.getValue(difference), i)}
          else hashMap[nums[i]] = i
     }
        return intArrayOf()
    }
}
