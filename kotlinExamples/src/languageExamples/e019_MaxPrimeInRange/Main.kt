package languageExamples.e019_MaxPrimeInRange

import kotlin.math.roundToInt
import kotlin.math.sqrt

// Find the biggest prime number in given collection
fun main() {
    val arr = arrayOf(3, 5, 9, 12, 27, 43, 79, 86)
    val max = maxPrime(arr.asIterable())
    print(max)
}

fun maxPrime(iterable: Iterable<Int>) = iterable.filter { isPrime(it) }.max()!!

fun isPrime(n: Int) = (n % 2 != 0) && (3..sqrt(n.toDouble()).roundToInt() step 2).find { n % it == 0 } == null