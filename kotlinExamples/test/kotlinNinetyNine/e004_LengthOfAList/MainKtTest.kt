package kotlinNinetyNine.e004_LengthOfAList

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun listLength() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7)
        val expected = 7
        val actual = list.listLength()

        assertEquals("List length is different", expected, actual)
    }

    @Test
    fun listLengthNullableList() {
        val list = listOf(1, 2, 3, 4, null, 5, 6, 7)
        val expected = 8
        val actual = list.listLength()

        assertEquals("List length is different", expected, actual)
    }

    @Test
    fun nthElementEmptyList() {
        val list = listOf<Int>()
        val expected = 0
        val actual = list.listLength()

        assertEquals("List length is different", expected, actual)
    }

}