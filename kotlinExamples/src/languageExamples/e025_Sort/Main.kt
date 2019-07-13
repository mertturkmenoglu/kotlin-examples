package languageExamples.e025_Sort

fun main() {
    val arr = arrayOf(4, 3, 5, 1, 7, 7, 8, 2, 5, 1, 9, 2, 2, 4)
    println(arr.asList())

    println("Built-in")
    var tmp = arr.copyOf()
    println(tmp.sorted())

    println("Bubble sort")
    tmp = arr.copyOf()
    bubbleSort(tmp)
    println(tmp.asList())

    println("Selection sort")
    tmp = arr.copyOf()
    selectionSort(tmp)
    println(tmp.asList())

    println("Insertion sort")
    tmp = arr.copyOf()
    insertionSort(tmp)
    println(tmp.asList())

    println("Shell sort")
    tmp = arr.copyOf()
    shellSort(tmp)
    println(tmp.asList())

    println("Quick sort")
    tmp = arr.copyOf()
    quickSort(tmp)
    println(tmp.asList())
}