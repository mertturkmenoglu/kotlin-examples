package practice.problemSolving.e115_GoldbachConjecture

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class MainTest {
    @Nested
    inner class GConjecture {
        @Test
        fun `start point must be greater than two`() {
            val start = 0
            val end = 10

            val expected = "Start number must be greater than two"
            val actual = assertThrows<IllegalArgumentException> { gConjecture(start, end) }.message

            assertEquals(expected, actual)
        }

        @Test
        fun `end point must be greater than two`() {
            val start = 4
            val end = 1

            val expected = "End number must be greater than two"
            val actual = assertThrows<IllegalArgumentException> { gConjecture(start, end) }.message

            assertEquals(expected, actual)
        }

        @Test
        fun `end point must be greater than start point`() {
            val start = 10
            val end = 5

            val expected = "End number must be greater than start number"
            val actual = assertThrows<IllegalArgumentException>  { gConjecture(start, end) }.message

            assertEquals(expected, actual)
        }

        @Test
        fun `odd start and end points should assert true`() {
            val start = 5
            val end = 13

            val expected = listOf(
                    3 to 3,
                    3 to 5,
                    3 to 7,
                    5 to 7
            )

            val actual = gConjecture(start, end)

            for ((exp, act) in expected.zip(actual)) {
                assertEquals(exp.first, act.first)
                assertEquals(exp.second, act.second)
            }
        }

        @Test
        fun `should work up to 40`() {
            val start = 3
            val end = 40

            val expected = listOf(
                2 to 2,
                3 to 3,
                3 to 5,
                3 to 7,
                5 to 7,
                3 to 11,
                3 to 13,
                5 to 13,
                3 to 17,
                3 to 19,
                5 to 19,
                3 to 23,
                5 to 23,
                7 to 23,
                3 to 29,
                3 to 31,
                5 to 31,
                7 to 31,
                3 to 37
            )

            val actual = gConjecture(start, end)

            for ((exp, act) in expected.zip(actual)) {
                assertEquals(exp.first, act.first)
                assertEquals(exp.second, act.second)
            }
        }
    }
}