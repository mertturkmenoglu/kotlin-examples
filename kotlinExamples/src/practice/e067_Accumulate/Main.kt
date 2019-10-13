package practice.e067_Accumulate

fun main() {
    @Suppress("SpellCheckingInspection")
    val input = "RqaEzty"
    val result = accumulate(input)
    println(result)
}

fun accumulate(input: String): String {
    require(input.all { it in 'a'..'z' union 'A'..'Z' })
    return input.toLowerCase().mapIndexed { i, c ->
        c.toUpperCase() + c.toString().repeat(i)
    }.joinToString("-")
}