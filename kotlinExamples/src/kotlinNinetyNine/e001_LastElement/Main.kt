package kotlinNinetyNine.e001_LastElement

fun main() {
    val a = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).getLast()
    println(a)
}

fun <T> List<T>.getLast(): T = last()