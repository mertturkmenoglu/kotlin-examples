package practice.e046_TwoDigitInt

val numbers = mapOf("zero" to 0, "one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5, "six" to 6,
        "seven" to 7, "eight" to 8, "nine" to 9)

val tenToTwenty = mapOf("ten" to 10, "eleven" to 11, "twelve" to 12, "thirteen" to 13, "fourteen" to 14, "fifteen" to 15,
        "sixteen" to 16, "seventeen" to 17, "eighteen" to 18, "nineteen" to 19)

val multiples = mapOf("twenty" to 20, "thirty" to 30, "forty" to 40, "fifty" to 50, "sixty" to 60, "seventy" to 70,
        "eighty" to 80, "ninety" to 90)

val allNumbers = numbers + tenToTwenty + multiples
val upToTwenty = numbers + tenToTwenty

fun main() {
    val input = "ninety seven"
    val result = parseInt(input)
    println(result)
}

fun parseInt(input: String): Int {
    val words = input.split(" ")

    if (words.size == 1)
        return allNumbers[words.first()] ?: throw Exception("Can not parse")

    // <--- Two words --->

    // Can not contain "zero"
    if (words.contains("zero"))
        throw Exception("Can not contain zero")

    // Can not starts with this words
    if (words.first() in numbers || words.first() in upToTwenty)
        throw Exception("First word is not allowed")

    // Second word can not be this words
    if (words.component2() in tenToTwenty)
        throw Exception("Second word is not allowed")

    val first = multiples[words.first()] ?: throw Exception("Can not parse first word")
    val second = numbers[words.component2()] ?: throw Exception("Can not parse second word")

    return first + second
}