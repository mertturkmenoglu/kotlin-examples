package languageExamples.other.e001_Input

/**
 * Example 001: Taking User Input
 *
 * Taking basic user input from standard input stream(console)
 *
 * @see readLine
 * @see toInt
 */
fun main() {
    // It is always good to output what is expected from user
    println("Enter your name: ")
    val name: String = readLine() ?: ""
    println("Name: $name")

    println("Enter age: ")
    val age: Int = readLine()?.toInt() ?: -1
    println("Age: $age")
}