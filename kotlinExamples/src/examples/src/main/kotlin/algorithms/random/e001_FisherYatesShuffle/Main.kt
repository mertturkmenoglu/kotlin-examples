package algorithms.random.e001_FisherYatesShuffle

import kotlin.random.Random

fun main() {
    val arr = Array(10) { it }
    println("Before shuffle: ${arr.asList()}")
    shuffle(arr)
    println("After shuffle: ${arr.asList()}")
}

fun <T> shuffle(arr: Array<T>) {
    for (i in arr.size - 1 downTo 1) {
        val j = Random.nextInt(0, i+1)
        arr[i] = arr[j].also { arr[j] = arr[i] }
    }
}