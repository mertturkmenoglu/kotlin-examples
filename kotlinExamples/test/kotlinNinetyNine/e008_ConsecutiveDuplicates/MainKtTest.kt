@file:Suppress("UNUSED_VARIABLE")

package kotlinNinetyNine.e008_ConsecutiveDuplicates

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun compress() {
        val list =  "aaaabccaadeeee".toList()
        val expected = listOf('a', 'b', 'c', 'a', 'd', 'e')
        val actual = list.compress()

        assertEquals("Compress extension function", expected, actual)
    }

    @Test
    fun compressNullableValue() {
        val list = listOf(null, null, 3, 3, 2, null, 2)
        val expected = listOf(null, 3, 2, null, 2)
        val actual = list.compress()

        assertEquals("Compress extension function", expected, actual)
    }

    @Test(expected = NoSuchElementException::class)
    fun compressEmptyList() {
        val list = listOf<Int>()
        val actual = list.compress()
    }

}