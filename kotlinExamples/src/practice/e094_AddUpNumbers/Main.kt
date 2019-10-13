package practice.e094_AddUpNumbers

fun main() {
    val list = listOf(10, 15, 3, 7)
    val k = 17
    val result = isThereAnyAddUps(list, k)

    if (result.first) {
        println(result.second)
    }

    improved(list, k).run { if (first) println(second) }
}

// Brute force solution
fun isThereAnyAddUps(l: List<Int>, k: Int): Pair<Boolean, List<Int>> {
    for (i in l.indices) {
        for (j in l.indices) {
            if (i != j && l[i] + l[j] == k)
                return true to listOf(l[i], l[j])
        }
    }

    return false to emptyList()
}

// Improved solution
fun improved(l: List<Int>, k: Int): Pair<Boolean, List<Int>> {
    val passed = mutableSetOf<Int>()

    for (e in l) {
        if (k - e in passed) {
            return true to listOf(e, k - e)
        }
        passed.add(e)
    }

    return false to emptyList()
}