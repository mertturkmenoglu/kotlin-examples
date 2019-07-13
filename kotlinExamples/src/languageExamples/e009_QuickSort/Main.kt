package languageExamples.e009_QuickSort

fun <T : Comparable<T>> quickSort(array: Array<T>, begin: Int = 0, end: Int = array.size - 1) {
    if (begin < end) {
        val pIndex = partition(array, begin, end)
        quickSort(array, begin, pIndex - 1)
        quickSort(array, pIndex + 1, end)
    }
}

private fun <T : Comparable<T>> partition(array: Array<T>, begin: Int, end: Int): Int {
    val pivot = array[end]
    var i = begin - 1

    for (j  in begin until end) {
        if (array[j] <= pivot) {
            i++
            array[i] = array[j].also { array[j] = array[i] }
        }
    }

    i++
    array[i] = array[end].also { array[end] = array[i] }

    return i
}

fun main() {
    val arr = arrayOf(3, 1, 5, 3, 3, 7, 2, 0)
    println(arr.asList())

    quickSort(arr, 0, arr.size - 1)
    println(arr.asList())
}