package projectEuler.p004_LargestPalindromeProduct

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
fun main() {
    val result = products().filter { isPalindrome(it) }.max()
    println(result)
}

fun isPalindrome(number: Int) = number.toString() == number.toString().reversed()

fun products(): List<Int> {
    return ArrayList<Int>().apply {
        for (i in 100..999) {
            for (j in 100..999)
                add(i * j)
        }
    }
}

