package practice.problemSolving.e083_EulerTotient

fun main() {
    val input = 9_999_999_985L
    val result = totient(input)
    println(result)
}

@Suppress("SpellCheckingInspection")
fun totient(n: Long): Int {
    require(n >= 1L) { "Function is valid for n >= 1" }
    return (1L..n).count { gcd(n, it) == 1L }
}

fun gcd(a: Long, b: Long): Long = (1..minOf(a, b)).reversed().first { a % it == 0L && b % it == 0L }