package kotlinNinetyNine.e007_Flatten

fun main() {
    val a = listOf(listOf(1, 2), listOf(2), listOf(3, listOf(5, 8)))
    val result = a.flattenList()
    println(result)
}

fun <T> List<List<T>>.flattenList() = this.flatten()