package collections.builders.e001_BuildList

import kotlin.random.Random

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val flag = Random.nextBoolean()

    val init = listOf(1, 2, 4, 8)
    val numbers = buildList {
        if (flag) {
            add(1)
        }

        init.mapTo(this) { it * 2 }
    }

    println(numbers)
}