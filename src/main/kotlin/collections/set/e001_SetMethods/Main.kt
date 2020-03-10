package collections.set.e001_SetMethods

fun main() {
    val set = setOf(1, 2, 3, 4)
    println("set: $set")

    println("set.contains(1): ${set.contains(1)}")
    println("set.containsAll(listOf(2, 3)): ${set.containsAll(listOf(2, 3))}")

    println("set.isEmpty(): ${set.isEmpty()}")
    println("set.isNotEmpty(): ${set.isNotEmpty()}")
    println("set.isNullOrEmpty(): ${set.isNullOrEmpty()}")

    val positive = set.all { it > 0 }
    println(positive)

    val odd = set.any { it % 2 != 0 }
    println(odd)

    val count = set.count { it % 2 == 0 }
    println(count)

    for (element in set) {
        println(element)
    }

    val newSet = set + 5
    println(newSet)
}