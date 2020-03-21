package practice.problemSolving.e091_ConvertPhoneNumber

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows

class MainTest {
    @Nested
    inner class ConvertPhoneNumber {
        @Test
        fun `empty list should throw exception`() {
            val input = emptyList<Int>()
            val actual = assertThrows<IllegalArgumentException>  {
                convertPhoneNumber(input)
            }

            assertEquals("List size must be equal to 10", actual.message)
        }

        @Test
        fun `list size less than 10 should throw exception`() {
            val input = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
            val actual = assertThrows<IllegalArgumentException>  {
                convertPhoneNumber(input)
            }

            assertEquals("List size must be equal to 10", actual.message)
        }

        @Test
        fun `list size greater than 10 should throw exception`() {
            val input = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0)
            val actual = assertThrows<IllegalArgumentException>  {
                convertPhoneNumber(input)
            }

            assertEquals("List size must be equal to 10", actual.message)
        }

        @Test
        fun `list contains elements not in range 0-9 should throw exception`() {
            val input = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            val actual = assertThrows<IllegalArgumentException> {
                convertPhoneNumber(input)
            }

            assertEquals("List cannot contain X that x !in 0..9", actual.message)
        }

        @Test
        fun `valid input`() {
            val input = listOf(5, 3, 2, 1, 2, 3, 4, 5, 6, 7)
            val expected = "(532) 123-4567"
            val actual = assertDoesNotThrow { convertPhoneNumber(input) }

            assertEquals(expected, actual)
        }
    }
}