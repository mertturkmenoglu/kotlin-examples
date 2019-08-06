package kotlinNinetyNine.e022_RangeToList

fun main() {
    val begin = 4
    val end = 9
    val result = (begin..end).rangeToList()
    println(result)
}

// Or just toList()
fun IntRange.rangeToList(): List<Int> {
    val result = ArrayList<Int>()

    for (i in this) {
        result.add(i)
    }

    return result
}