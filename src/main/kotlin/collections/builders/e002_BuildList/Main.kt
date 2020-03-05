package collections.builders.e002_BuildList

import kotlin.random.Random

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val numbers = buildList {
        repeat(10) {
            if (Random.nextBoolean()) {
                add(Random.nextInt(0, 100))
            }
        }
    }

    println(numbers)
}