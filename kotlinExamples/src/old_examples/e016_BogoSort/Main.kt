package old_examples.e016_BogoSort

import java.util.*

fun main() {

//    for(i in 0..20) {
//        print("${Random().nextInt(8)}\t")
//    }

    val len = 10
    val array = Array(len) { i: Int -> Random().nextInt(len) }
    println(array.asList())
    val counter = bogoSort(array, len)
    println("Tried: $counter\n${array.asList()}")

}

fun bogoSort(array: Array<Int>, len: Int):Int {

    var counter = 0
    while(!isSorted(array, len)) {
        for(i in 0 until len/2) {
            val j = Random().nextInt(len)
            val k = Random().nextInt(len)
            val temp = array[j]
            array[j] = array[k]
            array[k] = temp
        }
        counter++
    }
    return counter

}

fun isSorted(array: Array<Int>, len: Int):Boolean {
    var i = 0
    while(i<len-1) {
        if(array[i] > array[i+1])
            return false
        i++
    }
    return true
}