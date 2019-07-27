package practice.e022_Search

fun <T: Comparable<T>> linearSearch(collection: Collection<T>, value: T): Int {
    collection.forEachIndexed {i, e ->
        if (e == value)
            return i
    }

    return -1
}

fun <T: Comparable<T>> binarySearch(collection: Collection<T>, value: T): Int {
    var left = 0
    var right = collection.size - 1

    while(left <= right) {
        val middle = (left + right) / 2
        when {
            value < collection.elementAt(middle) -> right = middle - 1
            value > collection.elementAt(middle) -> left = middle + 1
            else -> return middle
        }
    }

    return -1
}

fun main() {
    val arr = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(linearSearch(arr, 7))
    println(binarySearch(arr, 3))
}