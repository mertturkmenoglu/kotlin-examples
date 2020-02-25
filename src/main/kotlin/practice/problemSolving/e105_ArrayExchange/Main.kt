package practice.problemSolving.e105_ArrayExchange

fun main() {
    val arr1 = arrayOf(1, 2, 3)
    val arr2 = arrayOf(4, 5, 6)
    exchangeArrays(arr1, arr2)
    println(arr1.asList())
    println(arr2.asList())
}

private fun <T> exchangeArrays(a1: Array<T>, a2: Array<T>) {
    for (i in a1.indices) {
        val index = a2.size - 1 - i
        a1[i] = a2[index].also { a2[index] = a1[i] }
    }
}

