package projectEuler.p014_LongestCollatzSequence

/**
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.*/
fun main() {
    val result = longestCollatzSequence(upperLimit = 1_000_000L)
    println(result)
}

fun longestCollatzSequence(upperLimit: Long): Long {
    var max = Pair(-1L, -1L)    // (Number, Count)
    var current = 1L

    while (current < upperLimit) {
        var counter = 0L
        var n = current

        while (n != 1L) {
            if (n % 2L == 0L) {
                n /= 2
            } else {
                n = n * 3 + 1
            }
            counter++
        }

        if (counter > max.second) {
            max = Pair(current, counter)
        }

        current++
    }

    return max.first
}