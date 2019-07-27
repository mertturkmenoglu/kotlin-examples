package kotlinNinetyNine.e018_ExtractASliceFromAList

import org.junit.Test

import org.junit.Assert.*
import java.lang.IndexOutOfBoundsException

class MainKtTest {

    @Test
    fun extractSlice() {
        val list = "1234321".toList()
        val expected = listOf('2', '3')
        val actual = list.extractSlice(1, 3)

        assertEquals("Slice extract", expected, actual)
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun extractSliceEmptyList() {
        val list = emptyList<Int>()
        @Suppress("UNUSED_VARIABLE") val actual = list.extractSlice(5, 10)
    }

}