package collections.general.e008_JavaCollectionsFramework

import java.util.*

fun main() {
    val list = arrayListOf(1, 1, 2, 3, 5)
    list.shuffle() // Collections.shuffle()
    println(list)

    val count = Collections.frequency(list, 1)
    println(count)

    val list2 = arrayListOf(1, 2, 3, 4, 5)
    val isDisjoint = Collections.disjoint(list, list2)
    println(isDisjoint)

    val list3 = mutableListOf(1, 2, 3, 4, 5)
    Collections.rotate(list3, 1)
    println(list3)
}