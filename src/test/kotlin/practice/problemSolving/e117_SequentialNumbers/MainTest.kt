package practice.problemSolving.e117_SequentialNumbers

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class MainTest {
    @Nested
    inner class GroupSequentialNumbers {
        @Test
        fun `empty list should return empty list`() {
            val input = emptyList<Int>()
            val expected = emptyList<List<Int>>()
            val actual = groupSequentialNumbers(input)

            assertThat(expected, `is`(actual))
        }

        @Test
        fun `listOf(1, 2, 3) should return listOf(listOf(1, 2, 3))`() {
            val input = listOf(1, 2, 3)
            val expected = listOf(listOf(1, 2, 3))
            val actual = groupSequentialNumbers(input)

            assertThat(expected, `is`(actual))
        }

        @Test
        fun `negative number range should assert true`() {
            val input = listOf(-9, -8, -7, -5, -4, -3, -2, -1)
            val expected = listOf(
                    listOf(-9, -8, -7),
                    listOf(-5, -4, -3, -2, -1)
            )

            val actual = groupSequentialNumbers(input)

            for ((e, a) in expected.zip(actual)) {
                assertThat(e, `is`(a))
            }
        }

        @Test
        fun `negative and positive number range should assert true`() {
            val input = listOf(-9, -7, -5, -3, -2, -1, 0, 1, 3, 4, 5)
            val expected = listOf(
                    listOf(-9),
                    listOf(-7),
                    listOf(-5),
                    listOf(-3, -2, -1, 0, 1),
                    listOf(3, 4, 5)
            )

            val actual = groupSequentialNumbers(input)

            for ((e, a) in expected.zip(actual)) {
                assertThat(e, `is`(a))
            }
        }

        @Test
        fun `discrete numbers should assert true`() {
            val input = (-10 .. 10 step 2).toList()
            val expected = input.map { listOf(it) }
            val actual = groupSequentialNumbers(input)

            for ((e, a) in expected.zip(actual)) {
                assertThat(e, `is`(a))
            }
        }


    }
}