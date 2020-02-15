package practice.problemSolving.e111_SplitCamelCase

fun main() {
    val input = listOf("emilyIsTheBest", "camelCase", "haskellIsHardMan")
    val result = input.map(::splitCamelCase)
    println(input)
    println(result)
}

private fun splitCamelCase(str: String): String {
    return str.split("(?=\\p{Lu})".toRegex()).joinToString(" ")
}