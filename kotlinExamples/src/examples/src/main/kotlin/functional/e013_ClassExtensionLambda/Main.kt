package functional.e013_ClassExtensionLambda

fun main() {
    // Concat two strings
    val concat: String.(String) -> String = { this + it }
    val input = "Emily"
    val other = " Smith"

    val result = input.concat(other)
    println(result)
}
