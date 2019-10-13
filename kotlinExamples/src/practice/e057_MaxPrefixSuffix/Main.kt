package practice.e057_MaxPrefixSuffix

fun main() {
    @Suppress("SpellCheckingInspection")
    val input = "abcdabc"
    val result = input.maxPrefixSuffix()
    println(result)
}

fun String.maxPrefixSuffix() = sequence {
    for (i in 0..length / 2)
        if (take(i) == takeLast(i)) yield(i)
}.max() ?: throw Exception()