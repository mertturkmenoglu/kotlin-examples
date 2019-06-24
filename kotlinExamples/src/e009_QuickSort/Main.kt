package e009_QuickSort

fun <T> quickSort(array: Array<T>, begin: Int, end: Int) {
    if (begin < end) {
        val pIndex = partition(array, begin, end)
        quickSort(array, begin, pIndex - 1)
        quickSort(array, pIndex + 1, end)
    }
}

fun <T> partition(array: Array<T>, begin: Int, end: Int, func: (T, T) -> Boolean = ::stdCompare): Int {
    val pivot = array[end]
    var i = begin - 1

    for (j  in begin until end) {
        if (func(array[j], pivot) or (array[j] == pivot)) {
            i++
            val tmp = array[i]
            array[i] = array[j]
            array[j] = tmp
        }
    }

    val tmp = array[i+1]
    array[i+1] = array[end]
    array[end] = tmp

    return i + 1
}

fun <T> stdCompare(first: T, second: T): Boolean {
    first as Number
    second as Number
    return first.toDouble() <= second.toDouble()
}

fun main() {
    val arr = arrayOf(3, 1, 5, 3, 3, 7, 2, 0)
    println(arr.asList())

    quickSort(arr, 0, arr.size - 1)
    println(arr.asList())
}