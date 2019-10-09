package practice.e099_RadixSort

fun main() {
    val input = arrayOf(170, 45, 75, 90, 802, 24, 2, 66)
    println(input.asList())
    radixSort(input, input.size)
    println(input.asList())
}

fun countSort(arr: Array<Int>, n: Int, exp: Int) {
    val output = Array(n) { 0 }
    val count = Array(10) { 0 }

    for (i in 0 until n) count[ (arr[i] / exp) % 10 ]++
    for (i in 1 until 10) count[i] += count[i-1]

    for (i in n-1 downTo 0) {
        output[count[(arr[i]/exp)%10] - 1] = arr[i]
        count[ (arr[i] / exp) % 10 ]--
    }

    output.copyInto(arr)
}

fun radixSort(arr: Array<Int>, n: Int) {
    val m = arr.max() ?: throw Exception()
    var exp = 1

    while (m / exp > 0) {
        countSort(arr, n, exp)
        exp *= 10
    }
}
