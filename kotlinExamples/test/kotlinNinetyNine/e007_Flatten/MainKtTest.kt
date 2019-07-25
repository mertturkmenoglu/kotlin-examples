package kotlinNinetyNine.e007_Flatten

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun flattenList() {
        val list = listOf(listOf(), listOf(4), listOf(2), listOf(3, listOf(5, 8, 12)))
        val expected = listOf(4, 2, 3, listOf(5, 8, 12))
        val actual = list.flattenList()

        assertEquals("Flatten list", expected, actual)
    }

    @Test
    fun flattenListEmptyList() {
        val list = listOf<List<Any>>()
        val expected = listOf<Any>()
        val actual = list.flattenList()

        assertEquals("Empty list flatten", expected, actual)
    }
}