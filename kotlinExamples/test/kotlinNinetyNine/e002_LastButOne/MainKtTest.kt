@file:Suppress("UNUSED_VARIABLE")

package kotlinNinetyNine.e002_LastButOne

import org.junit.Test

import org.junit.Assert.*
import java.lang.IndexOutOfBoundsException

class MainKtTest {
    @Test
    fun penultimateIntegerList() {
        val list = listOf(1, 2, 3, 4, 5)
        val expected = 4
        val actual = penultimate(list)
        assertEquals(expected, actual)
    }

    @Test
    fun penultimateNullableList() {
        val list = listOf(1, 2, 3, null, 4)
        val expected = null
        val actual = penultimate(list)

        assertEquals(expected, actual)
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun penultimateEmptyList() {
        val list = listOf<Int>()
        val actual = penultimate(list)
    }
}