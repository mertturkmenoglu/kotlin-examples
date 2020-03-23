package practice.problemSolving.e116_CollatzConjecture

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class MainTest {
    @Nested
    inner class CollatzConjecture {
        @Test
        fun `negative int should throw exception`() {
            val input = -1
            val expected = assertThrows<IllegalArgumentException> { collatzConjecture(input) }

            assertEquals(expected.message, "n must be equal to or greater than 1")
        }

        @Test
        fun `zero should throw exception`() {
            val input = 0
            val expected = assertThrows<IllegalArgumentException> { collatzConjecture(input) }

            assertEquals(expected.message, "n must be equal to or greater than 1")
        }

        @Test
        fun `one should return one`() {
            val input = 1
            val expected = sequenceOf(1L)
            val actual = collatzConjecture(input)

            for ((e, a) in expected.zip(actual)) {
                assertEquals(e, a)
            }
        }

        @Test
        fun `seven should assert true`() {
            val input = 7
            val expected = sequenceOf(7L, 22L, 11L, 34L, 17L, 52L, 26L, 13L,
                    40L, 20L, 10L, 5L, 16L, 8L, 4L, 2L, 1L)
            val actual = collatzConjecture(input)

            for ((e, a) in expected.zip(actual)) {
                assertEquals(e, a)
            }
        }

        @Test
        fun `number of steps for 63_728_127 should be 949`() {
            val input = 63_728_127
            val expected = 949
            val actual = collatzConjecture(input).toList().size - 1

            assertEquals(expected, actual)
        }

    }
}