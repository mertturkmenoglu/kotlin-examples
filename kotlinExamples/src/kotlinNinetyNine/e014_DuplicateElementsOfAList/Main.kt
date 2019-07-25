package kotlinNinetyNine.e014_DuplicateElementsOfAList

fun main() {
    val result = "abccd".toList().duplicate()
    println(result)
}

fun <T> List<T>.duplicate(): List<T> {
    val result = ArrayList<T>()

    this.forEach {
        repeat(2) { _ ->
            result.add(it)
        }
    }

    return result
}