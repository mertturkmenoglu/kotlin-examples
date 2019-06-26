package e025_Sort


fun <T : Comparable<T>>insertionSort(array: Array<T>) {
    val n = array.size

    for (i in 0 until n) {
        var j = i - 1
        val temp = array[i]
        while((j >= 0) && (array[j] > temp)) {
            array[j + 1] = array[j]
            j--
        }
        array[j+1] = temp
    }
}

fun <T : Comparable<T>> bubbleSort(array: Array<T>) {
    val n = array.size
    for(i in 0 until n - 1) {
        for(j in 0 until n - i - 1) {
            if(array[j] > array[j+1]) {
                array[j] = array[j + 1].also { array[j + 1] = array[j] }
            }
        }
    }
}

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

fun <T : Comparable<T>> selectionSort(array: Array<T>) {
    var location: Int
    var min: T
    val n = array.size

    for(i in 0 until n - 1) {
        location = i
        min = array[i]

        for(j in i + 1 until n) {
            if(array[j] < min) {
                min = array[j]
                location = j
            }
        }

        array[location] = array[i]
        array[i] = min
    }
}


fun <T : Comparable<T>> shellSort(array: Array<T>) {
    val n = array.size
    var h = n / 2

    while (h > 0) {
        for (i in h until n) {
            val temp = array[i]
            var j = i
            while ((j >= h) && (array[j - h] > temp)) {
                array[j] = array[j - h]
                j -= h
            }
            array[j] = temp
        }
        h /= 2
    }
}
