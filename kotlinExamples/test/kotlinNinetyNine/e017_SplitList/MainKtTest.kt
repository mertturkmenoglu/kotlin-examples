package kotlinNinetyNine.e017_SplitList

import org.junit.Assert.*
import org.junit.Test
import java.lang.IllegalArgumentException

class MainKtTest {

    @Test(expected = IllegalArgumentException::class)
    fun `empty list should throw exception`() {
        val input = emptyList<Char>()
        input.splitList(5)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `n greater than size should throw exception`() {
        val input = "123".toList()
        input.splitList(5)
    }

    @Test
    fun `should work on this`() {
        val input = "123456789".toList()
        val expected = "123".toList() to "456789".toList()
        val actual = input.splitList(3)
        assertEquals(expected, actual)
    }
}