package languageExamples.smartCast.e006_SmartCast

fun main() {
    smart("Emily")
    smart(3)
}

fun smart(x: Any) {
    if (x !is String || x.length == 0) {
        return
    }

    println(x.length)
}