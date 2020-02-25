package practice.problemSolving.e112_ProductExceptSelf

// Given a list, return an output list such that
// each corresponding list elements returns the product
// of the input list except itself

fun main() {
    val input = listOf(3, 6, 7, 2, 10)
    val result = productExceptSelf(input)

    println(input)
    println(result)
}

private fun productExceptSelf(numbers: List<Int>): List<Int> {
    return numbers.mapIndexed { i, _ ->
        numbers.foldIndexed(1) { index, acc, t -> if (index == i) acc else acc*t }
    }
}