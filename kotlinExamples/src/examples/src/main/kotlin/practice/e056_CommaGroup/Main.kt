package practice.e056_CommaGroup

fun main() {
    val input = 1_567_453
    val result = comma(input)
    println(result)
}

fun comma(input: Int) = input.toString().split("").filter { it != "" }
        .reversed().chunked(3).map { it.reversed() }.reversed()
        .joinToString(",") { it.joinToString("") }