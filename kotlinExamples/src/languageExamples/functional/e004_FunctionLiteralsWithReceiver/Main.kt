package languageExamples.functional.e004_FunctionLiteralsWithReceiver

fun main() {
    printNumberLiteral {
        printNumberExtension()
    }
}

// Extension function
fun Int.printNumberExtension() {
    println(this)
}

// Function literal with receiver type
fun printNumberLiteral(operation: Int.() -> Unit) {
    5.operation()
}