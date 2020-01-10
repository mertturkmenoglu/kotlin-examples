package practice.problemSolving.e083_EulerTotient

fun main() {
    val input = 9_999_999_985L
    val result = totient(input)
    println(result)
}

fun totient(n: Long): Int {
    require(n >= 1L) { "Function is valid for n >= 1" }
    return (1L..n).count { gcd(n, it) == 1L }
}

fun gcd(a: Long, b: Long): Long {
    var max = 0L
    val limit = if (a < b) a else b

    for (i in 1..limit) {
        if (a % i == 0L && b % i == 0L)
            max = i
    }

    return max
}