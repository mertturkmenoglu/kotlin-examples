package practice.problemSolving.e059_CatalanNumber

import java.math.BigInteger

fun main() {
    val input = 7
    val result = nthCatalanNumber(input)
    println(result)
}

fun nthCatalanNumber(n: Int): BigInteger {
    assert(n >= 0) { "Catalan numbers are defined for n >= 0" }
    return comb(2 * n, n) / (n + 1).toBigInteger()
}

fun comb(n: Int, r: Int): BigInteger {
    assert(n >= r)
    return fact(n) / (fact(r) * fact(n - r))
}

fun fact(n: Int): BigInteger {
    return if (n == 0 || n == 1) 1.toBigInteger() else n.toBigInteger() * fact(n - 1)
}