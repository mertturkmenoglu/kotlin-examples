package practice.problemSolving.e063_PseudoNumbers

import kotlin.properties.Delegates

fun main() {
    val input = listOf("0001", "4100", "5761")
    val result = iterationCountUntilLoop(input)
    println(result)
}

fun iterationCountUntilLoop(l: List<String>) = l.map(::iterationCount)

private fun iterationCount(str: String): Int {
    val seq = neumannRandomNumberGenerator(str.toInt())
    var counter = 0
    val iterator = seq.iterator()
    var curr: Int by Delegates.observable(initialValue = iterator.next()) { _, _, _ -> counter++ }
    curr = iterator.next()

    while (curr !in seq.take(counter)) curr = iterator.next()

    return counter
}

private fun neumannRandomNumberGenerator(n: Int) = sequence {
    var num = n
    yield(num)

    while (true) {
        val str = (num * num).toString()

        num = (if (str.length != 8) Array(8 - str.length) { 0 }.joinToString("") + str else str)
                .drop(2).dropLast(2).toInt()

        yield(num)
    }
}