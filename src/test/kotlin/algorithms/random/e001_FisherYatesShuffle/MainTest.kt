package algorithms.random.e001_FisherYatesShuffle

import org.junit.Assert
import org.junit.Test
import kotlin.random.Random

class MainTest {
    @Test
    fun `shuffle empty int array`() {
        val input = emptyArray<Int>()
        val expected = emptyArray<Int>()
        val actual = input.shuffle()
        Assert.assertTrue("Shuffled empty arrays must be equal", expected contentDeepEquals actual)
    }

    @Test
    fun `shuffle static int array compare length`() {
        val input = Array(100) { it }
        val actual = input.shuffle()

        Assert.assertEquals("Shuffled arrays must be equal length", actual.size, input.size)
    }

    @Test
    fun `shuffle static int array compare elements`() {
        val input = Array(100) { it }
        val actual = input.shuffle().sortedArray()

        Assert.assertTrue("Shuffled arrays must be equal when sorted", actual contentDeepEquals input)
    }

    @Test
    fun `shuffle dynamic int array compare elements`() {
        val input = sequence { repeat(10) { yield(Random.nextInt(0, 100)) } }
                .toList()
                .toTypedArray()

        val actual = input.shuffle().sortedArray()
        val expected = input.sortedArray()

        Assert.assertTrue("Shuffled dynamically produced arrays must be equal when sorted",
                expected contentDeepEquals actual)
    }
}