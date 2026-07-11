class Solution {
fun productExceptSelf(nums: IntArray): IntArray {
    val prefixArray = IntArray(nums.size) {1}
    val suffixArray = IntArray(nums.size) {1}
    val resultArray = IntArray(nums.size) {1}
    var sum = 1
    for (i in 1 until nums.size){
         sum *= nums[i - 1]
        prefixArray[i] = sum
    }
    sum = 1
    for (j in nums.size - 2 downTo  0) {
        sum *= nums[j + 1]
        suffixArray[j] = sum
    }
    for (k in nums.indices) {
        resultArray[k] = prefixArray[k] * suffixArray[k]
    }
    return resultArray
}
}
