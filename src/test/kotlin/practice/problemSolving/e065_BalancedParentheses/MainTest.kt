package practice.problemSolving.e065_BalancedParentheses

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class MainTest {
    @Nested
    inner class IsBalanced {
        @Test
        fun `empty string should return true`() {
            val input = ""
            val actual = isBalanced(input)

            assertTrue(actual)
        }

        @Test
        fun `no parentheses string should return true`() {
            val input = "2x+5-7/137"
            val actual = isBalanced(input)

            assertTrue(actual)
        }

        @Test
        fun `only parentheses balanced string should return true`() {
            val input = "()()[{{([])}}][][]{{}}"
            val actual = isBalanced(input)

            assertTrue(actual)
        }

        @Test
        fun `only parentheses unbalanced string should return false`() {
            val input = "()(){{[][]()()"
            val actual = isBalanced(input)

            assertFalse(actual)
        }

        @Test
        fun `balanced string should return true`() {
            val input = "{(2x+5)-7}/137"
            val actual = isBalanced(input)

            assertTrue(actual)
        }

        @Test
        fun `unbalanced string should return false`() {
            val input = "(2x+5-7/]137"
            val actual = isBalanced(input)

            assertFalse(actual)
        }
    }
}