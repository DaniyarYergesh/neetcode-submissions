class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
if (s1.length > s2.length) return false

        val count1 = IntArray(26)
        val count2 = IntArray(26)

        for (i in s1.indices) {
            count1[s1[i] - 'a']++
            count2[s2[i] - 'a']++
        }

        if (count1.contentEquals(count2))
            return true

        var left = 0

        for (right in s1.length until s2.length) {

            count2[s2[right] - 'a']++

            count2[s2[left] - 'a']--

            left++

            if (count1.contentEquals(count2))
                return true
        }

        return false

    }
}
