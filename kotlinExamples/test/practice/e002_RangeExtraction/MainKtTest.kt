package practice.e002_RangeExtraction

import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun `empty list should return empty string`() {
        val input = emptyList<Int>()
        val expected = ""
        val actual = extractRange(input)
        assertEquals(expected, actual)
        assertTrue(actual.isEmpty())
    }

    @Test
    fun `single element should not be converted to range`() {
        val input = listOf(1)
        val expected = "1"
        val actual = extractRange(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `should not extract a range from this consecutive two elements`() {
        val input = listOf(1, 2)
        val expected = "1, 2"
        val actual = extractRange(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `should not extract a range from this`() {
        val input = listOf(1, 3, 5)
        val expected = "1, 3, 5"
        val actual = extractRange(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `should convert this to a single range minimum 3 elements`() {
        val input = listOf(1,2,3)
        val expected = "1-3"
        val actual = extractRange(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `should convert this to a single range many elements`() {
        val input = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val expected = "1-9"
        val actual = extractRange(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `should convert this to range and individual elements`() {
        val input = listOf(-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20)
        val expected = "-6, -3-1, 3-5, 7-11, 14, 15, 17-20"
        val actual = extractRange(input)
        assertEquals(expected, actual)
    }

}