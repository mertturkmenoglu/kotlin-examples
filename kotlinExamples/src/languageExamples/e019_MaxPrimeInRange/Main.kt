package languageExamples.e019_MaxPrimeInRange

import kotlin.math.sqrt

// Find the biggest prime number in given collection

fun main() {
    val arr = arrayOf(3, 5, 9, 12, 27, 43, 79, 86)
    val max = maxPrime(arr.iterator())
    print(max)
}


fun maxPrime(iterator: Iterator<Int>): Int {
    var max = -1
    sequenceOf(iterator)
    iterator.forEach {
        if (it > max) {
            if (isPrime(it)) {
                max = it
            }
        }
    }

    return max
}


fun isPrime(n: Int): Boolean {
    var i = 3
    val sq = sqrt(n.toDouble())

    if (n % 2 == 0)
        return false

    while (i <= sq) {
        if (n % i == 0)
            return false
        i += 2
    }

    return true
}