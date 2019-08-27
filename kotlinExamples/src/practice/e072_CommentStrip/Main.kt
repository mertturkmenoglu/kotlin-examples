package practice.e072_CommentStrip

fun main() {
    val input = "apples, plums % and bananas\npears\noranges !applesauce"
    val result = solution(input, charArrayOf('%', '!'))
    println(result)
}

fun solution(input: String, c: CharArray): String {
    return input.split('\n').joinToString("\n") {
        it.takeWhile { ch -> ch !in c }.trim()
    }
}