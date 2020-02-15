package practice.problemSolving.e091_ConvertPhoneNumber

fun main() {
    val input = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val result = convertPhoneNumber(input)
    println(result)
}

fun convertPhoneNumber(l: List<Int>): String {
    return "(" + l.take(3).joinToString("") + ") " + l.subList(3, 6).joinToString("") + "-" + l.takeLast(4).joinToString("")
}

