package practice.problemSolving.e114_VowelCount

fun main() {
    val input = "Emily is THE best!!!"
    val result = vowelCount(input)

    println(result)
}

fun vowelCount(str: String): Int {
    return str.toLowerCase().count { it in listOf('a', 'e', 'i', 'o', 'u') }
}