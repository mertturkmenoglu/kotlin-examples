package practice.e102_NoteGroups

import kotlin.random.Random

fun main() {
    val input = mutableListOf<Int>().apply { repeat(100) { add(Random.nextInt(0, 100)) } }
    val result = noteGroups(input)
    println(result)
}

fun noteGroups(notes: List<Int>) = notes.groupingBy { it / 10 }.eachCount()
        .toSortedMap().mapKeys { "${it.key * 10}-${(it.key + 1) * 10}" }


