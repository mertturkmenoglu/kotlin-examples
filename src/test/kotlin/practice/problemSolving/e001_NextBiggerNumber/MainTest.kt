package practice.problemSolving.e001_NextBiggerNumber

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun nextNumberTest() {
        val input = 8392
        val expected = 8923
        val actual = nextNumber(input)

        assertEquals(expected, actual)
    }
}