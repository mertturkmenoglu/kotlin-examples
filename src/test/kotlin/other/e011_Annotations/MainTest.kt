package other.e011_Annotations

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Suppress("RedundantExplicitType")
class MainTest {
    @Nested
    inner class IsValidPositive {
        @Test
        fun `validate positive for a negative byte should return false`() {
            @Positive val input: Byte = -1
            val expected = false
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Negative number should return false")
        }

        @Test
        fun `validate positive for a negative short should return false`() {
            @Positive val input: Short = -1
            val expected = false
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Negative number should return false")
        }


        @Test
        fun `validate positive for a negative int should return false`() {
            @Positive val input: Int = -1
            val expected = false
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Negative number should return false")
        }


        @Test
        fun `validate positive for a negative long should return false`() {
            @Positive val input: Long = -1
            val expected = false
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Negative number should return false")
        }


        @Test
        fun `validate positive for a negative float should return false`() {
            @Positive val input: Float = -1F
            val expected = false
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Negative number should return false")
        }


        @Test
        fun `validate positive for a negative double should return false`() {
            @Positive val input: Double = -1.0
            val expected = false
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Negative number should return false")
        }

        @Test
        fun `validate positive for 0 should return false`() {
            @Positive val input = 0
            val expected = false
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Value 0 is not positive")
        }

        @Test
        fun `validate positive for not a number type input should return false`() {
            @Positive val input = "Not a number"
            val expected = false
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "String value is not a number. Hence, not positive")
        }

        @Test
        fun `validate positive for a positive byte should return true`() {
            @Positive val input: Byte = 1
            val expected = true
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Positive number should return true")
        }

        @Test
        fun `validate positive for a positive short should return true`() {
            @Positive val input: Short = 1
            val expected = true
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Positive number should return true")
        }

        @Test
        fun `validate positive for a positive int should return true`() {
            @Positive val input: Int = 1
            val expected = true
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Positive number should return true")
        }

        @Test
        fun `validate positive for a positive long should return true`() {
            @Positive val input: Long = 1
            val expected = true
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Positive number should return true")
        }

        @Test
        fun `validate positive for a positive float should return true`() {
            @Positive val input: Float = 1F
            val expected = true
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Positive number should return true")
        }

        @Test
        fun `validate positive for a positive double should return true`() {
            @Positive val input: Double = 1.0
            val expected = true
            val actual = Validate.isValidPositive(input)

            assertEquals(expected, actual, "Positive number should return true")
        }
    }

    @Nested
    inner class IsValidNotBlankString {
        @Test
        fun `validate NotBlankString for a not string value should return false`() {
            @NotBlankString val input = 1
            val expected = false
            val actual = Validate.isValidNotBlankString(input)

            assertEquals(expected, actual, "Non-string value should return false")
        }

        @Test
        fun `validate NotBlankString for an empty string should return false`() {
            @NotBlankString val input = ""
            val expected = false
            val actual = Validate.isValidNotBlankString(input)

            assertEquals(expected, actual, "Empty string should return false")
        }

        @Test
        fun `validate NotBlankString for a blank string should return false`() {
            @NotBlankString val input = " \t"
            val expected = false
            val actual = Validate.isValidNotBlankString(input)

            assertEquals(expected, actual, "Blank string should return false")
        }

        @Test
        fun `validate NotBlankString for a not blank string should return true`() {
            @NotBlankString val input = "NotBlank"
            val expected = true
            val actual = Validate.isValidNotBlankString(input)

            assertEquals(expected, actual, "Not blank string should return true")
        }
    }

    @Nested
    inner class IsValidPerson {
        @Test
        fun `validate person for invalid name and invalid age should return false`() {
            // TODO: Implement
        }

        @Test
        fun `validate person for invalid name and valid age should return false`() {
            // TODO: Implement
        }

        @Test
        fun `validate person for valid name and invalid age should return false`() {
            // TODO: Implement
        }


        @Test
        fun `validate person for valid name and valid age should return true`() {
            // TODO: Implement
        }
    }
}