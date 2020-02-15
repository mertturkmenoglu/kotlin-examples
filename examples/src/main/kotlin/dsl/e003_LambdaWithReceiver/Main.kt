package dsl.e003_LambdaWithReceiver

fun main() {
    val list1 = ArrayList<Int>().apply { add(1) }
    val list2 = ArrayList<Int>().myApply { add(2) }
    println(list1)
    println(list2)
}