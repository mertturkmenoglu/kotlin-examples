package practice.problemSolving.e002_RangeExtraction

/**
 * A format for expressing a non-empty ordered list of integers is to use a comma separated list of either
 *      - individual integers
 *      - or a range of integers denoted by the starting integer separated from the end integer
 *      in the range by a dash, '-'. The range includes all integers in the interval including
 *      both endpoints. It is not considered a range unless it spans at least 3 numbers.
 *      For example ("12, 13, 15-17")
 */
fun main() {
    val input = listOf(-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20)
    val result = extractRange(input)
    println(result)
}

fun extractRange(numbers: List<Int>): String {
    val ranges = ArrayList<String>()
    val stack = ArrayList<Int>()

    for (e in numbers) {
        // Check for a breakpoint
        if (stack.isNotEmpty() && e != stack.last() + 1) {
            if (stack.size < 3)
                stack.forEach { ranges.add("$it") }
            else
                ranges.add("${stack.first()}-${stack.last()}")

            stack.clear()
        }

        stack.add(e)
    }

    // Check if there are elements in the stack
    if (stack.isNotEmpty()) {
        if (stack.size < 3)
            stack.forEach { ranges.add("$it") }
        else
            ranges.add("${stack.first()}-${stack.last()}")
    }

    return ranges.joinToString()
}