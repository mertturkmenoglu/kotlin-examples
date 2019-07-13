package languageExamples.e028_Frequencies

fun main() {
    println("Input: ")
    val str = readLine()!!

    val expectedOutput = str.groupingBy { it }.eachCount()
    val output = frequency(str)

    println(expectedOutput)
    println(output)
}