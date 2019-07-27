package practice.e025_Sort


fun <T : Comparable<T>> MutableList<T>.insertionSort() {
    for (i in 0 until size) {
        var j = i - 1
        val temp = this[i]
        while((j >= 0) && (this[j] > temp)) {
            this[j + 1] = this[j]
            j--
        }
        this[j+1] = temp
    }
}

fun <T : Comparable<T>> MutableList<T>.bubbleSort() {
    for(i in 0 until size - 1) {
        for(j in 0 until size - i - 1) {
            if(this[j] > this[j+1]) {
                this[j] = this[j + 1].also { this[j + 1] = this[j] }
            }
        }
    }
}

fun <T : Comparable<T>> List<T>.quickSort(): List<T> =
        if (size < 2) {
            this
        } else {
            val pivot = first()
            val (smaller, greater) = drop(1).partition { it <= pivot }
            smaller.quickSort() + pivot + greater.quickSort()
        }

fun <T : Comparable<T>> MutableList<T>.selectionSort() {
    var location: Int
    var min: T

    for(i in 0 until size - 1) {
        location = i
        min = this[i]

        for(j in i + 1 until size) {
            if(this[j] < min) {
                min = this[j]
                location = j
            }
        }

        this[location] = this[i]
        this[i] = min
    }
}

fun <T : Comparable<T>> MutableList<T>.shellSort() {
    var h = size / 2

    while (h > 0) {
        for (i in h until size) {
            val temp = this[i]
            var j = i
            while ((j >= h) && (this[j - h] > temp)) {
                this[j] = this[j - h]
                j -= h
            }
            this[j] = temp
        }
        h /= 2
    }
}
