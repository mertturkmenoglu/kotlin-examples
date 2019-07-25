@file:Suppress("UNUSED_VARIABLE")

package kotlinNinetyNine.e001_LastElement

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getLastIntegerList() {
        val list = listOf(1, 2, 3, 4, 3, 2)
        val expected = 2
        val actual = list.getLast()

        assertEquals(expected, actual)
    }

    @Test
    fun getLastNullableList() {
        val list = listOf(1, 2, 3, null, 4, null)
        val expected = null
        val actual = list.getLast()

        assertEquals(expected, actual)
    }

    @Test(expected = NoSuchElementException::class)
    fun lastEmptyList() {
        val list = listOf<Int>()
        val actual = list.getLast()
    }

}