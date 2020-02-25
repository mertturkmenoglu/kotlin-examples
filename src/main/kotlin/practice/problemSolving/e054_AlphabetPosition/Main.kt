package practice.problemSolving.e054_AlphabetPosition

fun main() {
    val input = listOf("abode", "ABc", "xyzD")
    val result = positionCounter(input)
    println(result)
}

fun positionCounter(input: List<String>): List<Int> {
    return input.map { it.toUpperCase() }.map {
        it.mapIndexed { i, c -> c.toInt() - 65 == i }.count { i -> i }
    }
}