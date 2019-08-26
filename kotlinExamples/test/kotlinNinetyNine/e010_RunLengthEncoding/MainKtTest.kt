package kotlinNinetyNine.e010_RunLengthEncoding

import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun `should return empty list`() {
        val input = ""
        val expected = emptyList<Pair<Int, Char>>()
        val actual = input.toList().encode()
        assertEquals(expected, actual)
    }

    @Test
    @Suppress("SpellCheckingInspection")
    fun `should work on this`() {
        val input = "aaaabccaadeeee"
        val expected = listOf(4 to 'a', 1 to 'b', 2 to 'c', 2 to 'a', 1 to 'd', 4 to 'e')
        val actual = input.toList().encode()
        assertEquals(expected, actual)
    }

}