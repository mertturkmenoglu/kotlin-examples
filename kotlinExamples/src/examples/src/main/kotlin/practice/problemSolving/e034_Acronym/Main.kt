package practice.problemSolving.e034_Acronym

fun main() {
    val input = "The Road _Not_ Taken"
    val result = findAcronym(input)
    println(result)
}

fun findAcronym(str: String) = str.filter { it.isWhitespace() || it.isLetter() }
        .split("\\s+".toRegex()).fold("") { acc, s -> acc + s.first() }