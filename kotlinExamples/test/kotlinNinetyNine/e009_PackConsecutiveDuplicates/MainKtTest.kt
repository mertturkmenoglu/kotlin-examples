@file:Suppress("UNUSED_VARIABLE")

package kotlinNinetyNine.e009_PackConsecutiveDuplicates

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Suppress("SpellCheckingInspection")
    @Test
    fun pack() {
        val list = "aaaabccaadeeee".toList()
        val expected = listOf(
                listOf('a', 'a', 'a', 'a'),
                listOf('b'),
                listOf('c', 'c'),
                listOf('a', 'a'),
                listOf('d'),
                listOf('e', 'e', 'e', 'e')
        )
        val actual = list.pack()

        assertEquals("Pack", expected, actual)
    }

    @Test
    fun packNullable() {
        val list = listOf(null, null, null, 3, 3, 2, null, null)
        val expected = listOf(listOf(null, null, null), listOf(3, 3), listOf(2), listOf(null, null))
        val actual = list.pack()

        assertEquals("Pack", expected, actual)
    }

    @Test(expected = NoSuchElementException::class)
    fun packEmptyList() {
        val list = emptyList<Int>()
        val actual = list.pack()
    }
}