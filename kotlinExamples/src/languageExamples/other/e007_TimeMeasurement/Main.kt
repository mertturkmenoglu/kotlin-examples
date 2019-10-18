package languageExamples.other.e007_TimeMeasurement

import java.math.BigInteger
import kotlin.random.Random
import kotlin.system.measureNanoTime

fun main() {
    val l = mutableListOf<Int>().apply { repeat(Random.nextInt(1_000_000)) { add(Random.nextInt(1_000)) } }

    val elapsedTime1 = measureNanoTime {
        var sum = BigInteger.valueOf(0L)
        for (e in l) {
            sum += e.toBigInteger()
        }
        println("Sum: $sum")
    } / 1_000_000F

    val elapsedTime2 = measureNanoTime {
        var sum = BigInteger.valueOf(0L)
        l.forEach { sum += it.toBigInteger() }
        println("Sum: $sum")
    } / 1_000_000F

    val elapsedTime3 = measureNanoTime {
        val sum = l.map { it.toBigInteger() }.reduce { acc, e -> acc + e }
        println("Sum: $sum")
    } / 1_000_000F

    println(elapsedTime1)
    println(elapsedTime2)
    println(elapsedTime3)
}