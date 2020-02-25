package collections.array.e001_Array

fun main() {
    val arr = Array(10) { 0 } // { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    val arr2 = emptyArray<Int>() // Size 0
    val arr3 = arrayOf(1, 2, 3, 4, 5) // { 1, 2, 3, 4, 5 }
    val arr4 = arrayOfNulls<Int>(10) // Array<Int?>
    val arr5 = intArrayOf(1, 2, 3, 4, 5) // On JVM, equivalent to int[]

    println(arr.asList())
    println(arr2.asList())
    println(arr3.asList())
    println(arr4.asList())
    println(arr5.asList())
}