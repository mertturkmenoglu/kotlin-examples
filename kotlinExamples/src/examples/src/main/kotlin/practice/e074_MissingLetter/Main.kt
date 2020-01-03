package practice.e074_MissingLetter

fun main() {
    val input = listOf('a', 'b', 'c', 'd', 'f')
    val result = findMissingLetter(input)
    println(result)
}

fun findMissingLetter(l: List<Char>): Char {
    val result = l.zip(l.drop(1)).map { it.first.toInt() to it.second.toInt() }.find { it.second != it.first + 1 }
    return result?.first?.inc()?.toChar() ?: throw Exception()
}