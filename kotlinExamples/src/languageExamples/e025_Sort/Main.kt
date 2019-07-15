package languageExamples.e025_Sort

fun main() {
    val list = mutableListOf(4, 3, 5, 1, 7, 7, 8, 2, 5, 1, 9, 2, 2, 4)
    println(list)

    println("Built-in")
    println(list.toMutableList().apply { sort() })

    println("Bubble sort")
    println(list.toMutableList().apply { bubbleSort() })

    println("Selection sort")
    println(list.toMutableList().apply { selectionSort() })

    println("Insertion sort")
    println(list.toMutableList().apply { insertionSort() })

    println("Shell sort")
    println(list.toMutableList().apply { shellSort() })

    println("Quick sort")
    println(list.toMutableList().quickSort())
}