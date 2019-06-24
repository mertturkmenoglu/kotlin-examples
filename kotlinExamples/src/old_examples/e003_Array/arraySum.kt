package old_examples.e003_Array

fun main(args: Array<String>) {

    println("Please enter array size: ")
    val n = readLine()!!.toInt()
    val array = arrayOfNulls<Int>(n)

    for(i in 0 until n) {
        println("Array[$i]: ")
        array[i] = readLine()!!.toInt()
    }

    var sum = 0
    for(i in array)
        sum += i!!

    println("Sum of array elements: $sum")

}