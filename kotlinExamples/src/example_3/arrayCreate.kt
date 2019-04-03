package example_3

fun main(args: Array<String>) {

    val len = 10

    //Immutable array
    val array1 = emptyArray<Int>()
    println(array1.asList())

    //Static array
    val array2 = arrayOf(1,2,3)
    println(array2.asList())

    //Dynamic array it needs initialization
    val array3 = Array<Int>(len){0}
    for(i in 0 until len)
        array3[i] = i
    println(array3.asList())

    //Create a nullable array of Int
    val array4 = arrayOfNulls<Int>(len)
    for(i in 0 until len)
        array4[i] = i*2
    println(array4.asList())

    //Create an array with lambda
    //Similar to array3
    val array5 = Array<Int>(len, {i: Int -> 0} )
    println(array5.asList())

}