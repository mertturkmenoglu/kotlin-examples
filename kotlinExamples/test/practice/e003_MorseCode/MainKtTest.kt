package practice.e003_MorseCode

import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun `encode should return empty string`() {
        val input = ""
        val expected = ""
        val actual = encode(input)
        assertEquals(expected, actual)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `encode should throw exception`() {
        val input = "!!!CONTAINS ILLEGAL CHARACTER!!!"
        encode(input)
    }

    @Test
    fun `encode should parse correctly`() {
        val input = "test string"
        val expected = "- . ... -  ... - .-. .. -. --."
        val actual = encode(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `decode should return empty string`() {
        val input = ""
        val expected = ""
        val actual = decode(input)
        assertEquals(expected, actual)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `decode should throw exception`() {
        val input = ". - 1"
        decode(input)
    }

    @Test
    fun `decode should parse correctly`() {
        val input = "- . ... -  ... - .-. .. -. --."
        val expected = "TEST STRING"
        val actual = decode(input)
        assertEquals(expected, actual)
    }

}