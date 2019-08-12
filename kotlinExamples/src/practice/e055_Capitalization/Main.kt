package practice.e055_Capitalization

fun main() {
    val input = "emily"
    val result = capitalize(input)
    println(result)
}

fun capitalize(input: String): Pair<String, String> {
    return with(input) {
        val first = mapIndexed { i, c -> if (i % 2 == 0) c.toUpperCase() else c }.joinToString("")
        val second = mapIndexed { i, c -> if (i % 2 == 1) c.toUpperCase() else c }.joinToString("")
        first to second
    }
}