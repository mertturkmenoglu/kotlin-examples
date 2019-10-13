package practice.e041_ConsonantValue

val vowels = setOf('a', 'e', 'i', 'o', 'u')

fun main() {
    val input = "strength"
    val result = consonantValue(input)
    println(result)
}

fun consonantValue(input: String): Int {
    require(input.all { it.isLetter() && !it.isWhitespace() }) { "Only alphabet letters are allowed" }
    val parts = input.toLowerCase().map { if (it in vowels) '_' else it }
            .joinToString("").split('_').filterNot { it.isEmpty() }

    return parts.map { it.map { c -> c.toInt() - 97 + 1 } }
            .map { it.reduce { acc, i -> acc + i } }.max() ?: throw Exception()
}