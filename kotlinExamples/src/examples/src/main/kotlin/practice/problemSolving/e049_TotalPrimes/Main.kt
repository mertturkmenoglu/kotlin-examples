package practice.problemSolving.e049_TotalPrimes

import kotlin.math.roundToInt
import kotlin.math.sqrt

@ExperimentalUnsignedTypes
fun main() {
    val result = totalPrimes(begin = 10U, end = 1_000_000U)
    println(result)
}

@ExperimentalUnsignedTypes
fun totalPrimes(begin: UInt, end: UInt): List<UInt> {
    val primes = (begin..end).filter { it.isPrime() }
    return ArrayList<UInt>().apply { primes.forEach { if (it.isTotalPrime()) add(it) } }
}

@ExperimentalUnsignedTypes
fun UInt.isPrime(): Boolean {
    if (this < 2U) return false
    if (this == 2U) return true
    if (this % 2U == 0U) return false
    return (3..sqrt(this.toDouble()).roundToInt() step 2).find { this % it.toUInt() == 0U } == null
}

@ExperimentalUnsignedTypes
fun UInt.isTotalPrime(): Boolean {
    val parts = ArrayList<Pair<String, String>>()

    with(this.toString()) {
        for (i in 1 until length) {
            val first = take(i)
            val second = takeLast(toString().length - i)
            if (second.first() != '0') {
                parts.add(first to second)
            }
        }
    }

    return parts.any { it.first.toUInt().isPrime() && it.second.toUInt().isPrime() }
}