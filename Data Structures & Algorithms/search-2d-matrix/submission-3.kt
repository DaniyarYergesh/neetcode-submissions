class Solution {
fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    var l = 0
    var r = matrix.size
    while (l < r) {
        val possibleIndex = l + (r - l) / 2
        val row = matrix[possibleIndex]
        if (target in row[0]..row[row.size - 1]) {
            return search(row, target)
        }
        if (target < row[0]) {
            r = possibleIndex
        } else {
            l = possibleIndex + 1
        }
    }

    return false
}

fun search(array: IntArray, target: Int): Boolean {
    var l = 0
    var r = array.size 

    while (l <= r) {
        val guess = l + (r - l) / 2

        when {
            array[guess] > target -> {
                r = guess - 1
            }
            array[guess] < target -> {
                l = guess + 1
            }
            else -> return true
        }
    }
    return false
}
}
