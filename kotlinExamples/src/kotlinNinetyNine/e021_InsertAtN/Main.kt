package kotlinNinetyNine.e021_InsertAtN

fun main() {
    val input = "abcd".toList()
    val n = 1
    val element = 'X'
    val result = input.insertAtN(element, n)
    println(result)
}

fun <T> List<T>.insertAtN(element: T, n: Int): List<T> {
    require(n >= 0) { "Invalid index" }
    return this.toMutableList().apply { add(n, element) }
}