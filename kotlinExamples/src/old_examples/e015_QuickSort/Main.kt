package old_examples.e015_QuickSort

/*
 * Quick Sort test
 */

fun main(args: Array<String>) {

    println("Please enter your array size: ")
    val len = readLine()!!.toInt()
    var array = Array<Int>(len, {i:Int -> 0})

    for(i in 0 until len) {
        println("A[$i]: ")
        array[i] = readLine()!!.toInt()
    }

    println("Before sorting: ${array.asList()}")
    quickSort(0, len-1, array)
    println("After sorting: ${array.asList()}")

}

fun quickSort(low: Int = 0, high: Int = 0, array: Array<Int> = emptyArray()) {

    if(low < high) {
        val pivotIndex:Int = partition(low, high, array)
        quickSort(0, pivotIndex-1, array)
        quickSort(pivotIndex+1, high, array)
    }

}

fun partition(low: Int = 0, high: Int = 0, array: Array<Int> = emptyArray()):Int {
    val pivot:Int = array[high]
    var i = low - 1

    for(j in low until high) {
        if(array[j] <= pivot) {
            i++
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp
        }
    }

    i++
    val temp = array[i]
    array[i] = array[high]
    array[high] = temp
    return i
}