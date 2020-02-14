package practice.problemSolving.e110_ZeroElements

fun main() {
    val input = intArrayOf(1, 2, 0, 0, 3, 0, 4, 5)
    println("Original Array: ${input.asList()}")

    moveZeros(input)

    println("Altered Array: ${input.asList()}")
}

private fun moveZeros(arr: IntArray) {
    var count = 0

    for (i in arr.indices) {
        if (arr[i] != 0) {
            arr[count++] = arr[i]
        }
    }

    while (count < arr.size) {
        arr[count++] = 0
    }
}