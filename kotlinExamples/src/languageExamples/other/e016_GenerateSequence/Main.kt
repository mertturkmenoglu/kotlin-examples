package languageExamples.other.e016_GenerateSequence

fun main() {
    val fib = generateSequence(1.toBigInteger() to 1.toBigInteger()) { it.second to it.first + it.second }.map { it.first }

    var i = 0
    val iter = fib.iterator()
    var curr = 0.toBigInteger()
    while (i < 100) {
        curr = iter.next()
        i++
    }

    println(curr)
}