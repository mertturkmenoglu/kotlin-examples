package practice.problemSolving.e037_BitSort

fun main() {
    val result = bitSort(listOf(3, 8, 3, 6, 5, 7, 9, 1))
    println(result)
}

fun bitSort(list: List<Int>): List<Int> {
    // Pair.first: number Pair.second: set bit count
    val numbers = ArrayList<Pair<Int, Int>>()
    list.forEach { numbers.add(it to Integer.toBinaryString(it).count { c -> c == '1' }) }

    return numbers.sortedWith(Comparator { o1, o2 ->
        when {
            o1.second < o2.second -> -1
            o1.second > o2.second -> 1
            else -> when {
                o1.first < o2.first -> -1
                o1.first > o2.first -> 1
                else -> 0
            }
        }
    }).map { it.first }
}