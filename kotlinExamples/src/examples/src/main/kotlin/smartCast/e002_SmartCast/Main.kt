package smartCast.e002_SmartCast

fun main() {
    smart(3)
    smart("Emily")
}

fun smart(x: Any) {
    if (x is String) {
        // Smart cast
        println(x)
        println(x.length)
    } else {
        println("$x is not a string")
    }
}