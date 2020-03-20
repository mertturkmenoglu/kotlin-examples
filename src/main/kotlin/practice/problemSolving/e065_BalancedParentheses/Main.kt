package practice.problemSolving.e065_BalancedParentheses

import java.util.*

fun main() {
    val input = "[(3x+5) + 7 * (5x + 1)] + 2 * 7"
    val result = isBalanced(input)

    println(result)
}

internal fun isBalanced(str: String): Boolean {
    val openingParentheses = "{[(".toList()
    val closingParentheses = "}])".toList()

    // Get only parentheses
    val input = str.filter {
        it in openingParentheses + closingParentheses
    }

    if (input.length % 2 == 1) {
        return false
    }

    val stack = Stack<Char>()

    for (c in input) {
        // If current character c is a closing parentheses
        // Check the top element of the stack
        if (c in closingParentheses) {
            val topElementIndex = openingParentheses.indexOf(stack.peek())
            val currentElementIndex = closingParentheses.indexOf(c)

            if (stack.isEmpty() || topElementIndex != currentElementIndex) {
                return false
            }

            stack.pop()
        } else {
            stack.push(c)
        }
    }

    return stack.isEmpty()
}
