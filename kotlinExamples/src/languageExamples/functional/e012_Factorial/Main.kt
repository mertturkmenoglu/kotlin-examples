package languageExamples.functional.e012_Factorial

fun main() {
    val input = 17
    val result1 = factorial(input.toLong())
    val result2 = oldFactorial(input)

    println(result1)
    println(result2)
}

// Tail recursion is a concept comes from functional programming
// It gives a hint to compiler for stack usage optimisation
tailrec fun factorial(n: Long, r: Long = 1L): Long {
    return if (n < 1L) r else factorial(n - 1, r * n)
}

// Good old recursive function.
// Keep an eye on stack overflows
fun oldFactorial(n: Int): Long {
    return if (n < 1) 1 else n.toLong() * oldFactorial(n - 1)
}