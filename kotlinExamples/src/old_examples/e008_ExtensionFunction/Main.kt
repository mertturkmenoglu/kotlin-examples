package old_examples.e008_ExtensionFunction


// Can be written in single line statement
// fun String.hasSpaces() = find { it == ' ' } != null
fun String.hasSpaces(): Boolean {
    val found: Char? = this.find {it == ' '}
    return found != null
}

fun main() {
    println("Does it have spaces?".hasSpaces())
}