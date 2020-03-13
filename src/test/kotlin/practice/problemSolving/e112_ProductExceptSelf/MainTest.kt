package practice.problemSolving.e112_ProductExceptSelf

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import kotlin.random.Random

class MainTest {
    @Nested
    inner class ProductExceptSelf {
        @Test
        fun `empty list should return empty list`() {
            val input = emptyList<Int>()
            val expected = emptyList<Int>()
            val actual = productExceptSelf(input)

            assertEquals(expected, actual, "Empty list should return empty list")
        }

        @Test
        fun `empty list should not throw an exception`() {
            val input = emptyList<Int>()
            val expected = emptyList<Int>()
            val actual = assertDoesNotThrow { productExceptSelf(input) }

            assertEquals(expected, actual, "Empty list should return empty list")
        }

        @Test
        fun `list with one item should return 0`() {
            val input = listOf(Random.nextInt(10, 100))
            val expected = listOf(0)
            val actual = productExceptSelf(input)

            assertEquals(expected, actual, "List with one item should return 0")
        }

        @Test
        fun `list contains 0 should not throw an exception`() {
            val input = listOf(0, 1, 2, 3)
            val expected = listOf(6, 0, 0, 0)
            val actual = assertDoesNotThrow { productExceptSelf(input) }

            assertEquals(expected, actual, "Lists are not the same")
        }

        @Test
        fun `all negative number list should return correct result`() {
            val input = listOf(-1, -2, -3, -4)
            val expected = listOf(-24, -12, -8, -6)
            val actual = productExceptSelf(input)

            assertEquals(expected, actual, "Lists are not the same")
        }

        @Test
        fun `all zero list should return all zero list and should not throw an exception`() {
            val input = listOf(0, 0, 0, 0, 0)
            val expected = listOf(0, 0, 0, 0, 0)
            val actual = assertDoesNotThrow { productExceptSelf(input) }

            assertEquals(expected, actual, "Lists are not the same")
        }
    }
}