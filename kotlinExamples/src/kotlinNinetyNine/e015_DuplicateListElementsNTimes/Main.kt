package kotlinNinetyNine.e015_DuplicateListElementsNTimes

@Suppress("SpellCheckingInspection")
fun main() {
    val result = "abccd".toList().duplicateN(3)
    println(result)
}

fun <T> List<T>.duplicateN(n: Int): List<T> {
    val result = ArrayList<T>()

    this.forEach {
        repeat(n) { _ ->
            result.add(it)
        }
    }

    return result
}