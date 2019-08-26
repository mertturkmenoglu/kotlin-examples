package practice.e005_DigitDelete

import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test(expected = IllegalArgumentException::class)
    fun `small number should throw exception`() {
        deleteDigit(0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `big number should throw exception`() {
        deleteDigit(2_000_000)
    }

    @Test
    fun `should return correct`() {
        val input = 10
        val expected = 1
        val actual = deleteDigit(input)
        assertEquals(expected, actual)
    }

}