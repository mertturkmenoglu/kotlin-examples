package functional.e009_LambdaParameter

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val oddFilter = { number: Int -> number % 2 == 1 }
    val odds = numbers.filter(oddFilter)
    println(odds.toString())
}