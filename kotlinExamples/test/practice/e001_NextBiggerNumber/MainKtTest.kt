package practice.e001_NextBiggerNumber

import org.junit.Assert.*
import org.junit.Test
import java.lang.IllegalArgumentException

class MainKtTest {

    @Test(expected = IllegalArgumentException::class)
    fun `non positive integer should throw exception`() {
        val input = -1
        nextNumber(input)
    }

    @Test
    fun `should return a big number`() {
        val input = 8392
        val expected = 8923
        val actual = nextNumber(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `should return -1`() {
        val input = 432
        val expected = -1
        val actual = nextNumber(input)
        assertEquals(expected, actual)
    }

}