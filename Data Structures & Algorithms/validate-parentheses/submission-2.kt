class Solution {
    fun isValid(s: String): Boolean {
    if(s.length % 2 != 0) return false
    val closeToOpen = hashMapOf('}' to '{', ']' to '[', ')' to '(')
    val stack = Stack<Char>()

    for (char in s) {
        if (char in closeToOpen.keys) {
            if (stack.isNotEmpty() && stack.peek() == closeToOpen[char]) {
                stack.pop()
            }
            else return false
        }
        else {
            stack.push(char)
        }
    }
    return stack.isEmpty()
    }
}
