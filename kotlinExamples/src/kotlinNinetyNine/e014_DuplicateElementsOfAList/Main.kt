package kotlinNinetyNine.e014_DuplicateElementsOfAList

fun main() {
    val result = duplicate("abccd".toList())
    println(result)
}

fun duplicate(list: List<Char>) = ArrayList<Char>().apply { list.forEach { repeat(2) { _ -> add(it) } } }
