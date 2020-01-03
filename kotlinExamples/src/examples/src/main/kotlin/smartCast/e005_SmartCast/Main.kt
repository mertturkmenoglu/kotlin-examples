package smartCast.e005_SmartCast

fun main() {
    smart("Emily")
    smart(3)
}

fun smart(x: Any) {
    if (x !is String) {
        println("$x is not a string")
        println(x.javaClass.name)
        println("----")
        return
    }

    // Smart cast
    // x is String in this context
    println(x)
    println(x.javaClass.name)
    println(x.length)
    println("----")
}