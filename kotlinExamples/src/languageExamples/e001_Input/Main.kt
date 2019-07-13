package languageExamples.e001_Input

fun main() {
    println("Enter name: ")
    val name: String = readLine()?:"INVALID_NAME"
    println("Name: $name")

    println("Enter age: ")
    val age: Int = readLine()?.toInt()?:0
    println("Age: $age")
}