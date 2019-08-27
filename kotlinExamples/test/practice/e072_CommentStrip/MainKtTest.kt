package practice.e072_CommentStrip

import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

class MainKtTest {
    @Test
    fun `empty string should return empty string`() {
        val str = ""
        val c = charArrayOf('#', '!')
        val expected = ""
        val actual = comment(str, c)
        assertEquals(expected, actual)
    }

    @Test
    fun `no comment character should return the same string`() {
        val str = "normal text"
        val c = charArrayOf('#', '!')
        @Suppress("UnnecessaryVariable")
        val expected = str
        val actual = comment(str, c)
        assertEquals(expected, actual)
    }

    @Test
    fun `should work on this case`() {
        val str = "emily # the best\ndiana\nbarbara ! good"
        val c = charArrayOf('#', '!')
        val expected = "emily\ndiana\nbarbara"
        val actual = comment(str, c)
        assertEquals(expected, actual)
    }

    @Test
    fun `random string test should work`() {
        val lineCount = Random.nextInt(5, 10)
        val comment = setOf('#', '!')
        val charset = 'a'..'z' union 'A'..'Z' union setOf(' ') union comment
        val sb = StringBuilder()

        repeat(lineCount) {
            val lineLength = Random.nextInt(5, 20)
            for (i in 0 .. lineLength) {
                sb.append(charset.random())
            }
            sb.append('\n')
        }

        val str = sb.toString()
        val c = comment.toCharArray()
        val expected = lineCount + 1
        val response = comment(str, c)
        val actual = response.split('\n').size
        assertEquals(expected, actual)
        assertFalse(response.contains(c.toString()))
    }
}