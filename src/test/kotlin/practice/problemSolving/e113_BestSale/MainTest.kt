package practice.problemSolving.e113_BestSale

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class MainTest {
    @Nested
    inner class BestSale {
        @Test
        fun `empty list should throw IllegalArgumentException`() {
            val input = emptyList<Int>()
            val thrown = assertThrows<IllegalArgumentException> { bestSale(input) }

            assertEquals(thrown.message, "Invalid list", "Exception strings are not same")
        }

        @Test
        fun `static list returns expected`() {
            val input = listOf(10, 7, 6, 2, 9, 4)
            val expected = 3 to 4
            val actual = bestSale(input)

            assertEquals(expected, actual, "Function should return expected output")
        }

        @Test
        fun `decreasing list should return (0, 0)`() {
            val input = listOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
            val expected = 0 to 0
            val actual = bestSale(input)

            assertEquals(expected, actual, "Decreasing list should return (0, 0)")
        }
    }
}