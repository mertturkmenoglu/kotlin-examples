package practice.e064_DuplicateCounting

fun main() {
    val input = "Indivisibilities"
    val result = duplicateCount(input)
    println(result)
}

fun duplicateCount(str: String): String {
    val duplicates = str.toLowerCase().groupingBy { it }.eachCount().filter { it.value > 1 }

    val strBuilder = StringBuilder()
    for ((k, v) in duplicates) {
        strBuilder.append("'$k' occurs $v times\n")
    }

    return strBuilder.dropLast(1).toString()
}
