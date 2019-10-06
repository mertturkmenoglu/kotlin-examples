package practice.e093_PrimesUntilN

fun main() {
    val n = 15
    val result = primesUntilN(n)
    println(result)
}

fun primesUntilN(n: Int) = mutableListOf(2).apply { addAll((3 until n).filter { i -> all { i % it != 0 } }) }