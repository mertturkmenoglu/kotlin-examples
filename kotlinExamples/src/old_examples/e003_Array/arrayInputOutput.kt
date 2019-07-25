package old_examples.e003_Array

@Suppress("UnusedMainParameter")
fun main(args: Array<String>) {

    println("Please enter array size: ")
    val n = readLine()!!.toInt()
    val array1 = arrayOfNulls<Int>(n)

    for(i in 0 until n) {
        print("Array[$i]: ")
        array1[i] = readLine()!!.toInt()
    }
    println(array1.asList())

//    val array2 = arrayOf(1,2,"wrong type")
//    println(array2.asList())

}