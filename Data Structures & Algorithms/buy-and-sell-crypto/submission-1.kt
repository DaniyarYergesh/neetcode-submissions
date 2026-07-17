class Solution {
    fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var left = 0
    var right = 1
    while (right < prices.size) {
        if (prices[left] < prices[right]) {
            val profit = prices[right] - prices[left]
            maxProfit = maxOf(maxProfit, profit)
        } else {
            left = right
        }
        right ++
    }
    return maxProfit
    }
}
