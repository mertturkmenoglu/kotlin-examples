package kotlinNinetyNine.e006_PalindromeList

fun main() {
    val result = isPalindrome(listOf(1, 2, 3, 2, 1))
    println(result)
}

fun <T> isPalindrome(list: List<T>) = list == list.reversed()