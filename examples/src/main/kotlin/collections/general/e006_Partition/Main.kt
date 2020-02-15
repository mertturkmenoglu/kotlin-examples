package collections.general.e006_Partition

import kotlin.random.Random

fun main() {
    val list = mutableListOf<Int>().apply { repeat(Random.nextInt(5, 10)) { add(Random.nextInt(50)) } }
    val (fst, snd) = list.partition { it % 2 == 0 }

    println(list)
    println(fst)
    println(snd)
}