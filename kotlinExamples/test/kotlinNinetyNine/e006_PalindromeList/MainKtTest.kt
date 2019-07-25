package kotlinNinetyNine.e006_PalindromeList

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun isPalindromeTrue() {
        val list = listOf(1, 1, 2, 3, 4, 3, 2, 1, 1)
        val expected = true
        val actual = list.isPalindrome()

        assertEquals("List is palindrome", expected, actual)
    }

    @Test
    fun isPalindromeFalse() {
        val list = listOf(1, 1, 2, 1)
        val expected = false
        val actual = list.isPalindrome()

        assertEquals("List is not palindrome", expected, actual)
    }

    @Test
    fun isPalindromeEmptyListTrue() {
        val list = listOf<Int>()
        val expected = true
        val actual = list.isPalindrome()

        assertEquals("List is palindrome", expected, actual)
    }

}