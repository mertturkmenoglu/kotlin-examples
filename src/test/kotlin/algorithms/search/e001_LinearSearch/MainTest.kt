package algorithms.search.e001_LinearSearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.random.Random

class MainTest {
    @Nested
    inner class LinearSearch {
        @Test
        fun `empty list should return -1`() {
            val input = emptyList<Int>()
            val searchItem = 10
            val expected = -1
            val actual = linearSearch(input, searchItem)

            assertEquals(expected, actual, "Empty list should return -1")
        }

        @Test
        fun `first element null list should return 0`() {
            val input = listOf(null, 1, 2, 3, 4)
            val searchItem: Int? = null
            val expected = 0
            val actual = linearSearch(input, searchItem)

            assertEquals(expected, actual, "Null element should return 0")
        }

        @Test
        fun `list does not contain element should return -1`() {
            val input = listOf(1, 2, 3, 4, 5)
            val searchItem = 6
            val expected = -1
            val actual = linearSearch(input, searchItem)

            assertEquals(expected, actual, "List does not contain element should return -1")
        }

        @Test
        fun `list contains element should return true index`() {
            val input = (0 .. 100 step 2).toList()
            val searchItem = 12
            val expected = 6
            val actual = linearSearch(input, searchItem)

            assertEquals(expected, actual, "List contains element should return true index")
        }

        @Test
        fun `randomized searchItem should return true index`() {
            val input = (0 .. 100).toList()
            val searchItem = Random.nextInt(0, 101)

            @Suppress("UnnecessaryVariable")
            val expected = searchItem
            val actual = linearSearch(input, searchItem)

            assertEquals(expected, actual, "Randomized searchItem should return true index")
        }
    }
}