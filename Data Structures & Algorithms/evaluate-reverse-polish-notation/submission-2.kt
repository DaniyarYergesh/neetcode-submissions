class Solution {
    fun evalRPN(tokens: Array<String>): Int {
     val stack = Stack<Int>()
    for (token in tokens) {
        when (token) {
            "+" -> {
                val a = stack.pop()
                val b = stack.pop()
                stack.push(b + a)
            }

            "-" -> {
                val a = stack.pop()
                val b = stack.pop()
                stack.push(b - a)
            }

            "*" -> {
                val a = stack.pop()
                val b = stack.pop()
                stack.push(b * a)
            }

            "/" -> {
                val a = stack.pop()
                val b = stack.pop()
                stack.push(b / a)
            }

            else -> stack.push(token.toInt())
        }
    }

    return stack.peek()
    }
}
