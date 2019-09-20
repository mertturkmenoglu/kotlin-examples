package languageExamples.functional.e014_AnonymousFunction

// What is happening?
// TODO: Check functions
fun main() {
    val dividerFunction = fun(a: Int, b: Int): Int {
        if (b == 0)
            return 0
        return a / b
    }

    val dividerLambda = { a: Int, b: Int -> if (b == 0) 0 else a / b }

    val result1 = calculate(dividerFunction, 5, 0)
    val result2 = calculate(dividerLambda, 5, 0)

    println(result1)
    println("----")
    println(result2)
}

fun calculate(divider: (Int, Int) -> Int, a: Int, b: Int): Int {
    println("Before calculation")

    val result = divider(a, b)

    println("After calculation")

    return result
}