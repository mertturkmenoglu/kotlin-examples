package functional.e002_HigherOrderFunctions

typealias AllTypes = Any?

fun printMessage(message: AllTypes) {
    println("PrintMessage called")
    println(message)
}

fun <T> foreach(arr: Array<T>, func: (T) -> Unit) {
    for (element in arr) {
        func(element)
    }
}

fun main() {
    printMessage("Emily is the best")
    val specialFunction: (Any?) -> Unit = ::printMessage
    val sf = ::printMessage
    specialFunction("Emily is the best")
    sf("Emily is the best")

    foreach(arrayOf(1, 2, 3, 4, 5)) {
        println(it * it)
    }

    foreach(arrayOf(1, 2, 3, 4, 5), fun(x: Int) {
        println(x * x)
    })


}