package projectEuler.p001_Multiplesof3and5

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
fun main() {
    val numbers = findNumbers(first = 3, second = 5, upperLimit = 1000)
    val result = numbers.reduce { acc, i: Int -> acc + i }
    println(result)
}

fun findNumbers(first: Int, second: Int, upperLimit: Int): List<Int> {
    val numbers = ArrayList<Int>()
    for (i in first until upperLimit) {
        if (i % first == 0 || i % second == 0)
            numbers.add((i))
    }

    return numbers
}