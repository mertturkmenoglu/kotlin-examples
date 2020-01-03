package practice.e044_Cypher

fun main() {
    val message = "masterpiece"
    val code = listOf(14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8)

    val key = findTheKey(message, code)
    println(key)
}

fun findTheKey(message: String, code: List<Int>): List<Int> {
    val chars = message.toLowerCase().split("").filterNot { it == " " || it == "" }
            .map { it.first() }.map { it.toInt() - 97 + 1 }

    return chars.zip(code).map { it.second - it.first }
}