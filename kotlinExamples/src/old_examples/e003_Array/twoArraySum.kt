package old_examples.e003_Array

@Suppress("UnusedMainParameter")
fun main(args: Array<String>) {

    println("Please enter size of the arrays: ")
    val n = readLine()!!.toInt()

    val array1 = arrayOfNulls<Int>(n)
    val array2 = arrayOfNulls<Int>(n)
    val array3 = arrayOfNulls<Int>(n)

    for (i in 0 until n) {
        print("Array1[$i]: ")
        array1[i] = readLine()!!.toInt()
        print("Array2[$i]: ")
        array2[i] = readLine()!!.toInt()
        array3[i] = array1[i]!! + array2[i]!!
    }

    println(array1.asList())
    println(array2.asList())
    println(array3.asList())


}