package practice.problemSolving.e047_IntegerParse

val numbers = mapOf("zero" to 0, "one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5, "six" to 6,
        "seven" to 7, "eight" to 8, "nine" to 9)

val tenToTwenty = mapOf("ten" to 10, "eleven" to 11, "twelve" to 12, "thirteen" to 13, "fourteen" to 14, "fifteen" to 15,
        "sixteen" to 16, "seventeen" to 17, "eighteen" to 18, "nineteen" to 19)

val multiplies = mapOf("twenty" to 20, "thirty" to 30, "forty" to 40, "fifty" to 50, "sixty" to 60, "seventy" to 70,
        "eighty" to 80, "ninety" to 90)

val allNumbers = numbers + tenToTwenty + multiplies
val specialWords = mapOf("hundred" to 100, "thousand" to 1_000, "million" to 1_000_000, "billion" to 1_000_000_000)

fun main() {
    val input = "nine hundred and seventy nine million twenty one thousand two hundred and fifty one"
    val result = parseInt(input)
    println(result)
}

fun parseInt(input: String): Int {
    val groups = getGroups(input.split(" ").filterNot { it.toLowerCase() == "and" })
    return groups.map { parseParts(it) }.reduce { acc, i -> acc + i }
}

fun getGroups(words: List<String>): List<List<String>> {
    val groups = ArrayList<ArrayList<String>>()
    val tmp = ArrayList<String>()

    for (w in words) {
        tmp.add(w)
        if (w in specialWords.minus("hundred")) {
            groups.add(ArrayList<String>().apply { tmp.forEach { add(it) } })
            tmp.clear()
        }
    }

    groups.add(ArrayList<String>().apply { tmp.forEach { add(it) } })
    return groups.filterNot { it.isEmpty() }
}

fun parseParts(a: List<String>): Int {
    var tmp = 0

    for (e in a) {
        tmp = if (e in specialWords) tmp * specialWords.getValue(e) else tmp + allNumbers.getValue(e)
    }

    return tmp
}
