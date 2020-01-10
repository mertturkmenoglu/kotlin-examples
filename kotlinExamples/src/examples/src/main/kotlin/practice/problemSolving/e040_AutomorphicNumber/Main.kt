package practice.problemSolving.e040_AutomorphicNumber

// A number is called Automorphic number if and only if
// its square ends in the same digits as the number itself.
fun main() {
    val input = 76
    val result = isAutomorphic(input)
    println(result)
}

fun isAutomorphic(input: Int): Boolean = (input * input).toString().endsWith(input.toString(), true)

