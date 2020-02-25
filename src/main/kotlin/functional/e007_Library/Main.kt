package functional.e007_Library

import kotlin.random.Random

fun <T : Comparable<T>> List<T>.quickSort(): List<T> =
        if (size < 2) {
            this
        } else {
            val pivot = first()
            val (smaller, greater) = drop(1).partition { it <= pivot }
            smaller.quickSort() + pivot + greater.quickSort()
        }

fun main() {
    List(Random.nextInt(5, 10)) { Random.nextInt(0, 30) }
            .run {
                forEach { print(it); print("\t") }
                println()
                quickSort()
            }
            .forEach { print(it); print("\t") }
}