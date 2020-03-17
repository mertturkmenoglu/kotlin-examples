package practice.problemSolving.e114_VowelCount

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll


class MainTest {
    val lowerCaseList = listOf("a", "e", "i", "o", "u")
    val upperCaseList = listOf("A", "E", "I", "O", "U")

    fun randomStringGenerator(charSet: List<String>, stringLength: Int): String {
        val stringSequence = sequence {
            repeat(stringLength) {
                yield(charSet.random())
            }
        }

        return stringSequence.joinToString()
    }

    @Nested
    inner class VowelCount {
        @Test
        fun `empty string should return 0`() {
            val input = ""
            val expected = 0
            val actual = vowelCount(input)

            assertEquals(expected, actual)
        }

        @Test
        fun `single lowercase vowel string should return 1`() {
            val expected = 1
            assertAll("Lowercase",
                    lowerCaseList.map { { assertEquals(expected, vowelCount(it)) } }
            )
        }

        @Test
        fun `single uppercase vowel string should return 1`() {
            val expected = 1
            assertAll("Uppercase",
                    upperCaseList.map { { assertEquals(expected, vowelCount(it)) } }
            )
        }

        @Suppress("UnnecessaryVariable")
        @Test
        fun `many lowercase vowel string`() {
            val stringLength = 5
            val input = randomStringGenerator(charSet = lowerCaseList, stringLength = stringLength)
            val expected = stringLength
            val actual = vowelCount(input)

            assertEquals(expected, actual)
        }

        @Suppress("UnnecessaryVariable")
        @Test
        fun `many uppercase vowel string`() {
            val stringLength = 5
            val input = randomStringGenerator(charSet = upperCaseList, stringLength = stringLength)
            val expected = stringLength
            val actual = vowelCount(input)

            assertEquals(expected, actual)
        }

        @Suppress("SpellCheckingInspection")
        @Test
        fun `no vowel string should return 0`() {
            val input = "nvwlstrngshldrtrnzr"
            val expected = 0
            val actual = vowelCount(input)

            assertEquals(expected, actual)
        }

        @Test
        fun `consonant and vowel lowercase`() {
            val input = "emily is the best"
            val expected = 5
            val actual = vowelCount(input)

            assertEquals(expected, actual)
        }

        @Test
        fun `consonant and vowel uppercase`() {
            val input = "EMILY IS THE BEST"
            val expected = 5
            val actual = vowelCount(input)

            assertEquals(expected, actual)
        }

        @Test
        fun `consonant and vowel mixed cases`() {
            val input = "Emily is THE best"
            val expected = 5
            val actual = vowelCount(input)

            assertEquals(expected, actual)
        }

        @Test
        fun `consonant and vowel and punctuation characters`() {
            val input = "Emily is THE best!!!"
            val expected = 5
            val actual = vowelCount(input)

            assertEquals(expected, actual)
        }
    }
}