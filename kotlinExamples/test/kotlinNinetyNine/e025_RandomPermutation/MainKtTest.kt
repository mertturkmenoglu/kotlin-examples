package kotlinNinetyNine.e025_RandomPermutation

import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun `should return an empty list`() {
        val input = emptyList<Int>()
        val expected = emptyList<Int>()
        val actual = input.randomPermutation()
        assertEquals(expected, actual)
    }

    @Test
    fun `should return equal size`() {
        val input = listOf(1, 2, 3, 4, 5)
        val expected = input.size
        val actual = input.randomPermutation().size
        assertEquals(expected, actual)
    }
}