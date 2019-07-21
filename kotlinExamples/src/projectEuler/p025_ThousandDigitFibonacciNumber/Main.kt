package projectEuler.p025_ThousandDigitFibonacciNumber

import java.math.BigInteger

/**
 * The Fibonacci sequence is defined by the recurrence relation:
 *
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * Hence the first 12 terms will be:
 *
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * The 12th term, F12, is the first term to contain three digits.
 *
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
fun main() {
    val result = fib(digitCount = 1_000)
    println(result)
}

fun fib(digitCount: Int): Long {
    var first = BigInteger("1")
    var second = BigInteger("1")
    var third = first + second
    var index = 3L

    while (third.toString().length != digitCount) {
        first = second
        second = third
        third = first + second
        index++
    }

    return index
}