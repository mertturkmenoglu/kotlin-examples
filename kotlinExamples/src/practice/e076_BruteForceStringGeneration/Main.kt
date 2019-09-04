package practice.e076_BruteForceStringGeneration

fun main() {
    println("(Only English Alphabet Characters and space)")
    println("Enter your string: ")
    val input = readLine() ?: throw Exception()
    force(input)
}

fun force(input: String) {
    val charset = ('a'..'z') + ('A'..'Z') + setOf(' ')
    val sb = StringBuilder()
    var i = 0

    while (sb.toString() != input) {
        sb.append(charset[i])
        println(sb.toString())
        if (sb.toString() == input.take(sb.toString().length)) {
            i = 0
        } else {
            sb.deleteCharAt(sb.lastIndex)
            i++
        }
        Thread.sleep(90)
    }
}