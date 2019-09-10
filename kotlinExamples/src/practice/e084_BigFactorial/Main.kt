package practice.e084_BigFactorial

import java.math.BigInteger

fun main() {
    val n = 40
    val result = fact(n)
    println(result)
}

fun fact(n: Int): BigInteger {
    return (1 .. n).map { it.toBigInteger() }.fold(BigInteger("1")) { acc, e -> acc * e }
}