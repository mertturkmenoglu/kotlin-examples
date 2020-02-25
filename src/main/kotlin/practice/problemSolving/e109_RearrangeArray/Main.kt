package practice.problemSolving.e109_RearrangeArray

fun main() {
    val input = listOf(-1, -2, -3, -4, -5, 6, -7, 8, 9)
    val result = reArrangeArray(input)

    println("Original List: $input")
    println("Altered List: $result")
}

private fun reArrangeArray(input: List<Int>): List<Int> {
    val (neg, pos) = input.partition { it < 0 }

    return ArrayList(pos).apply {
        var i = 1

        for (n in neg) {
            if (i < size) add(i, n) else add(n)
            i += 2
        }
    }
}