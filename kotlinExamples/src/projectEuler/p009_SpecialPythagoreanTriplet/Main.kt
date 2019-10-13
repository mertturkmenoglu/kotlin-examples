package projectEuler.p009_SpecialPythagoreanTriplet

import kotlin.math.floor
import kotlin.math.sqrt

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
fun main() {
    val result = findPythagoreanTriplet(n = 1000)
    println(result)
}

fun findPythagoreanTriplet(n: Int): Int {
    for (i in 1..n) {
        for (j in 1..n) {
            val c = sqrt(i * i.toDouble() + j * j.toDouble())
            if (c == floor(c)) {
                if (i + j + c.toInt() == n) {
                    return i * j * c.toInt()
                }
            }
        }
    }

    return -1
}