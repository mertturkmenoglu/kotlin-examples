@file:Suppress("UNUSED_VARIABLE")

package kotlinNinetyNine.e001_LastElement

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {
    @Test
    fun lastIntegerList() {
        val list = listOf(1, 2, 3, 4, 3, 2)
        val expected = 2
        val actual = last(list)

        assertEquals(expected, actual)
    }

    @Test
    fun lastNullableList() {
        val list = listOf(1, 2, 3, null, 4, null)
        val expected = null
        val actual = last(list)

        assertEquals(expected, actual)
    }

    @Test(expected = NoSuchElementException::class)
    fun lastEmptyList() {
        val list = listOf<Int>()
        val actual = last(list)
    }
}