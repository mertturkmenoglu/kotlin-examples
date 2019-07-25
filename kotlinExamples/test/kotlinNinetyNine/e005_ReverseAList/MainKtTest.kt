@file:Suppress("UNUSED_VARIABLE")

package kotlinNinetyNine.e005_ReverseAList

import org.junit.Test

import org.junit.Assert.*
import java.lang.IndexOutOfBoundsException

class MainKtTest {

    @Test
    fun reverseOfTheList() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7)
        val expected = listOf(7, 6, 5, 4, 3, 2, 1)
        val actual = list.reverseOfTheList()

        assertEquals("Lists are different", expected, actual)
    }

    @Test
    fun reverseOfTheListNullableList() {
        val list = listOf(1, 2, 3, 4, null, 5, 6, 7)
        val expected = listOf(7, 6, 5, null, 4, 3, 2, 1)
        val actual = list.reverseOfTheList()

        assertEquals("Lists are different", expected, actual)
    }

    @Test
    fun nthElementEmptyList() {
        val list = listOf<Int>()
        val expected = list
        val actual = list.reverseOfTheList()

        assertEquals("Lists are different", expected, actual)
    }

}