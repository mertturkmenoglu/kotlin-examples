package projectEuler.p015_LatticePaths

import java.math.BigInteger

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 *
 * How many such routes are there through a 20×20 grid?
 */
fun main() {
    val result = path(n = 20)
    println(result)
}

fun path(n: Int) = factorial(2 * n) / (factorial(n) * factorial(n))

fun factorial(n: Int): BigInteger = if (n == 1) n.toBigInteger() else factorial(n - 1) * n.toBigInteger()