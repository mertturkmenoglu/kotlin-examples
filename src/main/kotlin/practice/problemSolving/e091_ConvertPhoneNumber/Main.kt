package practice.problemSolving.e091_ConvertPhoneNumber

fun main() {
    val input = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val result = convertPhoneNumber(input)

    println(result)
}

fun convertPhoneNumber(l: List<Int>): String {
    require(l.size == 10) { "List size must be equal to 10" }
    require(l.all { it in 0..9 }) { "List cannot contain X that x !in 0..9" }

    val head = l.take(3).joinToString("")
    val body = l.subList(3, 6).joinToString("")
    val tail = l.takeLast(4).joinToString("")

    return "($head) $body-$tail"
}

