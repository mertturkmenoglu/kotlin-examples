package practice.problemSolving.e082_WordScore

fun main() {
    val input = "It is during our darkest moments that we must focus to see the light"
    val result = highestScore(input)
    println(result)
}

fun highestScore(str: String) = str.split(" ").maxBy { it.sumBy { c -> c.toInt() } }.orEmpty()