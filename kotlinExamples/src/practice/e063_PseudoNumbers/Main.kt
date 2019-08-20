package practice.e063_PseudoNumbers

import kotlin.properties.Delegates

fun main() {
    val input = listOf("0001", "4100", "5761")
    val result = iterationCountUntilLoop(input)
    println(result)
}

fun iterationCountUntilLoop(l: List<String>): List<Int> {
    return l.map {
        val seq = neumannRandomNumberGenerator(it.toInt())
        var counter = 0
        val iter = seq.iterator()
        var curr: Int by Delegates.observable(initialValue = iter.next()) { _, _, _ -> counter++ }
        curr = iter.next()

        while (curr !in seq.take(counter)) {
            curr = iter.next()
        }

        counter
    }
}

fun neumannRandomNumberGenerator(n: Int) = sequence {
    var num = n
    yield(num)

    while (true) {
        val squared = num * num
        var str = squared.toString()

        if (str.length != 8) {
            str = Array(8 - str.length) { 0 }.joinToString("") + str
        }

        num = str.drop(2).dropLast(2).toInt()
        yield(num)
    }
}