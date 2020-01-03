package other.e004_TimeMeasurement

import kotlin.system.measureNanoTime

fun main() {
    val elapsedTime = measureNanoTime { heavyCalculation() }
    println("${elapsedTime / 1_000_000F} sec")
}

fun heavyCalculation() {
    for (i in 0..1_000_000) {
        kotlin.math.sqrt(i.toDouble())
    }
}