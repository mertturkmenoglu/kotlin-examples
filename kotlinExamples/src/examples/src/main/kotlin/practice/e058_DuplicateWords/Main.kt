package practice.e058_DuplicateWords

fun main() {
    val input = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"
    val result = input.removeDuplicates()
    println(result)
}

fun String.removeDuplicates() = this.toLowerCase().filter { it.isLetter() || it.isWhitespace() }.split(" ").toSet()