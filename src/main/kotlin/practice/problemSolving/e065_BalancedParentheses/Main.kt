package practice.problemSolving.e065_BalancedParentheses

import java.util.*

fun main() {
    val input = "[(3x+5) + 7 * (5x + 1)] + 2 * 7"
    val result = isBalanced(input)
    println(result)
}

fun isBalanced(str: String): Boolean {
    val parentheses = "{[()]}"
    val inp = str.filter { it in parentheses }.apply { if (length % 2 == 1) return false }

    val s = Stack<Char>()

    for (p in inp) {
        if (p in parentheses.slice(0..2)) {
            s.push(p)
        } else {
            if (s.isEmpty() || (parentheses.indexOf(s.peek()) != (parentheses.length - 1 - parentheses.indexOf(p))))
                return false
            s.pop()
        }
    }

    return true
}
