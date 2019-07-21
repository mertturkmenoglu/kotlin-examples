package projectEuler.p021_AmicableNumbers

/**
 * Let d(n) be defined as the sum of proper divisors of n
 * (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b,
 * then a and b are an amicable pair and each of a and b
 * are called amicable numbers.
 *
 * For example, the proper divisors of 220 are
 * 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
 * The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 *
 * Evaluate the sum of all the amicable numbers under 10000.
 */
fun main() {
    val result = sumOfAmicable(upperLimit = 10_000)
    println(result)
}

fun sumOfAmicable(upperLimit: Int): Int {
    val numbers = ArrayList<Pair<Int, Int>>()

    for (i in 1 until upperLimit) {
        if (isAmicable(i)) numbers.add(Pair(i, d(i)))
    }

    var result = 0
    numbers.forEach {
        if (it.first != it.second)
            result += it.first + it.second
    }

    return result / 2
}

fun isAmicable(n: Int) = (n == d(d(n)))

fun d(n: Int): Int {
    val divisors = ArrayList<Int>()

    for (i in 1 until n) {
        if (n % i == 0) divisors.add(i)
    }

    var result = 0
    divisors.forEach { result += it }

    return result
}