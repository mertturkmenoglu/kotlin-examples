package languageExamples.collections.general.e002_RandomChoice

import kotlin.random.Random

fun main() {
    val n = Random.nextInt(5, 10)
    val list = ArrayList<Int>()

    repeat(n) { list.add(Random.nextInt(0, n)) }
    println(list)

    repeat(n) {
        println("$it -th choice: ${list.shuffled()[0]}")
    }
}