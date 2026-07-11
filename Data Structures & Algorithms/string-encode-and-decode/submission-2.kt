class Solution {

    fun encode(strs: List<String>): String {
        val result = StringBuilder()
        strs.forEach { str ->
            result.append(str.length)
            result.append("#")
            result.append(str)
        }
        return result.toString()
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0
        while (i < str.length) {
            var j = i
            while(str[j] != '#') {
                j ++
            }
            val lengthOfCurrentString = str.substring(i, j).toInt()
            result.add(str.substring(j + 1, lengthOfCurrentString + j + 1))
            i = lengthOfCurrentString + j + 1
        }
        return result
    }
}
