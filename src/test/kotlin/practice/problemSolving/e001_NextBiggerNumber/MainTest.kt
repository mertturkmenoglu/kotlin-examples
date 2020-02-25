package practice.problemSolving.e001_NextBiggerNumber

import org.junit.Assert
import org.junit.Test

class MainTest {
    @Test
    fun nextNumberTest() {
        val input = 8392
        val expected = 8923
        val actual = nextNumber(input)
        Assert.assertEquals(expected, actual)
    }
}