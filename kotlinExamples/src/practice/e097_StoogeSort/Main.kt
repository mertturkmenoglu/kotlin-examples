package practice.e097_StoogeSort

import kotlin.random.Random

fun main() {
    val input = mutableListOf<Int>().apply { repeat(Random.nextInt(10, 20)) { add(Random.nextInt(-50, 100)) } }

    println(input)
    stoogeSort(input)
    println(input)
}

fun stoogeSort(l: MutableList<Int>, i: Int = 0, j: Int = l.size - 1) {
    if (l[i] > l[j]) {
        l[i] = l[j].also { l[j] = l[i] }
    }

    if (j - i + 1 > 2) {
        val t = (j - i + 1) / 3
        stoogeSort(l, i, j-t)
        stoogeSort(l, i+t, j)
        stoogeSort(l, i, j-t)
    }
}