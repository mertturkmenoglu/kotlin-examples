package collections.array.e002_PrimitiveArrays

fun main() {
    val arr1 = intArrayOf(1, 2, 3)
    val arr2 = arrayOf(1, 2, 3)

    println(arr1::class) // IntArray
    println(arr2::class) // Array

    takeIntArray(arr1)
    // Compile error: takeIntArray(arr2)
    takeIntArray(arr2.toIntArray())

    // Compile error: takeArray(arr1)
    takeArray(arr1.toTypedArray())
    takeArray(arr2)
}

fun takeIntArray(arr: IntArray) {
    println("Received IntArray")
}

fun takeArray(arr: Array<Int>) {
    println("Received Array<Int>")
}