@file:Suppress("UNUSED_VARIABLE")

package kotlinNinetyNine.e003_NthElement

import org.junit.Test

import org.junit.Assert.*
import java.lang.IndexOutOfBoundsException

class MainKtTest {

    @Test
    fun nthElement() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7)
        val expected = 4
        val actual = list.nth(3)

        assertEquals("List element is different", expected, actual)
    }

    @Test
    fun nthElementNullableList() {
        val list = listOf(1, 2, 3, 4, null, 5, 6, 7)
        val expected: Int? = null
        val actual = list.nth(4)

        assertEquals("List element is different", expected, actual)
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun nthElementEmptyList() {
        val list = listOf<Int>()
        val actual = list.nth(10)
    }

}