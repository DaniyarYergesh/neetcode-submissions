class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val mp = HashMap<Int, Int>()
        var res = 0

        for (num in nums) {
            if (mp[num] == null) {
                val left = mp[num - 1] ?: 0
                val right = mp[num + 1] ?: 0
                val sum = left + right + 1
                mp[num] = sum
                mp[num - left] = sum
                mp[num + right] = sum
                res = maxOf(res, sum)
            }
        }
        return res
    }
}
