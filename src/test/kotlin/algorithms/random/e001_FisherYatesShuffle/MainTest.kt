package algorithms.random.e001_FisherYatesShuffle

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.random.Random

class MainTest {
    @Nested
    inner class Shuffle {
        @Test
        fun `shuffle empty int array`() {
            val input = emptyArray<Int>()
            val expected = emptyArray<Int>()
            val actual = input.shuffle()

            assertTrue(expected contentDeepEquals actual, "Shuffled empty arrays must be equal")
        }

        @Test
        fun `shuffle static int array compare length`() {
            val input = Array(100) { it }
            val actual = input.shuffle()

            assertEquals(actual.size, input.size, "Shuffled arrays must be equal length")
        }

        @Test
        fun `shuffle static int array compare elements`() {
            val input = Array(100) { it }
            val actual = input.shuffle().sortedArray()

            assertTrue(actual contentDeepEquals input, "Shuffled arrays must be equal when sorted")
        }

        @Test
        fun `shuffle dynamic int array compare elements`() {
            val input = sequence { repeat(10) { yield(Random.nextInt(0, 100)) } }
                    .toList()
                    .toTypedArray()

            val actual = input.shuffle().sortedArray()
            val expected = input.sortedArray()

            assertTrue(expected contentDeepEquals actual,
                    "Shuffled dynamically produced arrays must be equal when sorted")
        }
    }
}