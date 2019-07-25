package kotlinNinetyNine.e006_PalindromeList

fun main() {
    val result = listOf(1, 2, 3, 2, 1).isPalindrome()
    println(result)
}

fun <T> List<T>.isPalindrome() = this == this.reversed()