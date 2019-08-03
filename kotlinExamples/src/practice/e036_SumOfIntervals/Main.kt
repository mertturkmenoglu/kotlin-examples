package practice.e036_SumOfIntervals

fun main() {
    val result = sumOfIntervals(listOf(1 to 4, 7 to 10, 3 to 5))
    println(result)
}

fun sumOfIntervals(list: List<Pair<Int, Int>>): Int {
    var intRange = mutableSetOf<Int>()
    val ranges = mutableListOf<IntRange>()

    ranges.addAll(sequence {
        list.associate { it.first to it.second }.forEach { yield(it.key .. it.value) }
    })

    for (r in ranges) {
       intRange = intRange.union(r).toMutableSet()
    }

    return intRange.size
}