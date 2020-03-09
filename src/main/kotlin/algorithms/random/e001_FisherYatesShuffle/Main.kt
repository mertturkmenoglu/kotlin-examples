package algorithms.random.e001_FisherYatesShuffle

import kotlin.random.Random

fun main() {
    val arr = Array(10) { it }
    val result = arr.shuffle()

    println("Before shuffle: ${arr.asList()}")
    println("After shuffle: ${result.asList()}")
}

fun <T> Array<T>.shuffle(): Array<T> {
    val result = this.copyOf()

    for (i in this.size - 1 downTo 1) {
        val j = Random.nextInt(0, i+1)
        result[i] = result[j].also { result[j] = result[i] }
    }

    return result
}