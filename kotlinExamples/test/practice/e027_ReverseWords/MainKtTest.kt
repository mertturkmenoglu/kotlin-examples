package practice.e027_ReverseWords

import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

class MainKtTest {

    @Test
    fun `empty string should return empty string`() {
        val input = ""
        val expected = ""
        val actual = reverseWords(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `one word should return reversed itself`() {
        val input = "one"
        val expected = input.reversed()
        val actual = reverseWords(input)
        assertEquals(expected, actual)
    }

    @Suppress("SpellCheckingInspection")
    @Test
    fun `should work on this case`() {
        val input = "one two three four"
        val expected = "eno owt eerht ruof"
        val actual = reverseWords(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `should work on random string`() {
        val n = Random.nextInt(5, 10)
        val charset = 'a'..'z' union 'A'..'Z' union setOf(' ')
        val str = sequence {
            repeat(n) {
                repeat(n) { yield(sequence { yield(charset.random()) }) }
            }
        }.joinToString(" ")

        val expected = str.length
        val response = reverseWords(str)
        val actual = response.length

        assertEquals(expected, actual)
        assertEquals(response.count { it.isWhitespace() }, str.count { it.isWhitespace() })
    }

}