class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result = IntArray(2)
        val hashMap = hashMapOf<Int, Int>()
        for (i in nums.indices) {
          val difference = target - nums[i]
          if (difference in hashMap.keys) {result = intArrayOf(hashMap.getValue(difference), i)}
          else hashMap[nums[i]] = i
     }
        return result
    }
}
