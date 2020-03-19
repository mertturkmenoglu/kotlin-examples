package other.e012_InstanceCheck

fun main() {
    println(findType(1..10))
    println(findType(listOf(4, 5, 6)))
    println(findType(setOf(1, 2, 3)))
}

internal fun findType(iterable: Iterable<Int>): Int {
    return when (iterable) {
        is List -> iterable[0]              // Smart cast to List
        is IntProgression -> iterable.last  // Smart cast to IntProgression
        else -> -1                          // Mandatory else branch
    }
}