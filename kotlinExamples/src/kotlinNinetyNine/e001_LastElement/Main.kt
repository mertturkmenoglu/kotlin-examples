package kotlinNinetyNine.e001_LastElement

fun main() {
    val a = last(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    println(a)
}

fun <T> last(list: List<T>) = list.last()