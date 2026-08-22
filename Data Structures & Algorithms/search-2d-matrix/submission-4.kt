class Solution {
fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
     val rows = matrix.size
    val cols = matrix[0].size
    var l = 0
    var r = rows * cols - 1

    while (l <= r) {
        val m = l + (r - l) / 2
        val row = m / cols
        val col = m % cols
        if (matrix[row][col] == target) {
            return true
        } else if (matrix[row][col] < target) {
            l = m + 1
        } else if (matrix[row][col] >= target) {
            r = m - 1
        }
    }
    return false
}
}
