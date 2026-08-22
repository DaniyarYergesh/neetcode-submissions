class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
    var l = 1
    var r = piles.maxOf { it }
    var res = r
    
    while (l <= r){
        val k = (l + r)/2
        var totalHour = 0
        for (pile in piles) {
            totalHour += ceil(pile/k.toDouble()).toInt()
        }
        
        if (totalHour <= h) {
            r = k - 1
            res = min(k , res)
        } else if (totalHour > h) {
            l = k + 1
        }
    }

    return res
    }
}
