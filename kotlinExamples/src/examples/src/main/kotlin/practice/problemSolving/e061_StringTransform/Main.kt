package practice.problemSolving.e061_StringTransform

fun main() {
    val input = "Emily is the BEST"
    val result = input.transform()
    println(result)
}

fun String.transform(): String {
    assert(isNotEmpty())
    return filter { it.isLetter() || it.isWhitespace() }.split(" ").reversed().joinToString(" ") {
        it.map { c -> if (c.isLowerCase()) c.toUpperCase() else c.toLowerCase() }.joinToString("")
    }
}