package practice.problemSolving.e039_JumpingNumber

// Given a number, find if it is jumping or not
// Function takes a positive integer
// Returns a boolean
// 9 to 0 is not a jump
// All single digit numbers are jumping numbers
// f(9) -> true
// f(13) -> false
// f(90) -> false
// f(3343456) -> false
// f(212343456) -> true
fun main() {
    val input = 32345
    val result = jumpingNumber(input)
    println(result)
}

fun jumpingNumber(input: Int): Boolean {
    require(input > 0) { "Requires positive number" }
    val str = input.toString()

    if (str.length == 1) return true

    for (i in 1..str.lastIndex) {
        if (str[i] != str[i - 1] + 1 && str[i] != str[i - 1] - 1)
            return false
    }

    return true
}