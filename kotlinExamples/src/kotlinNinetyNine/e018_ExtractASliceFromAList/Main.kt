@file:Suppress("SpellCheckingInspection")

package kotlinNinetyNine.e018_ExtractASliceFromAList

fun main() {
    val result = "abcdefghijk".toList().extractSlice(3, 7)
    println(result)
}

fun <T> List<T>.extractSlice(begin: Int, end: Int) = this.slice(begin until end)