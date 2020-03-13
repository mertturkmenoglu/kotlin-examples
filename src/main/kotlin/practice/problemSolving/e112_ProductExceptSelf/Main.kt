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

fun productExceptSelf(numbers: List<Int>): List<Int> {
    return if (numbers.size == 1) {
        listOf(0)
    } else {
        numbers.mapIndexed { index, _ ->
            numbers.toMutableList().apply { removeAt(index) }.fold(1) { acc, i -> acc * i }
        }
    }
}
