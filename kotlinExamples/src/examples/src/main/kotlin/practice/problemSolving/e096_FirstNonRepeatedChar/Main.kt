package practice.problemSolving.e096_FirstNonRepeatedChar

fun main() {
    val input = listOf("test", "teeter", "trend", "tt")
    val result = input.map(::firstNonRepeatedChar)
    println(result)
}

fun firstNonRepeatedChar(str: String): Char? {
    return str.find { ch -> ch in str.groupingBy { it }.eachCount().filter { it.value == 1 } }
}