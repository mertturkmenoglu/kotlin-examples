package kotlinNinetyNine.e015_DuplicateListElementsNTimes

fun main() {
    val result = duplicateN(3, "abccd".toList())
    println(result)
}

fun duplicateN(n: Int, list: List<Char>) = ArrayList<Char>().apply { list.forEach { repeat(n) { _ -> add(it) } } }