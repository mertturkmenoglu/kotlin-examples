package basics.e006_WhenExpressionWithEnum

enum class Color {
    RED, GREEN, BLUE
}

fun main() {
    val fst = Color.RED
    val snd = Color.GREEN
    val result = matcher(fst, snd)
    println(result)
}

fun matcher(fst: Color, snd: Color): String {
    return when (setOf(fst, snd)) {
        setOf(Color.RED, Color.GREEN) -> "YELLOW"
        setOf(Color.RED, Color.BLUE) -> "MAGENTA"
        setOf(Color.GREEN, Color.BLUE) -> "CYAN"
        else -> throw Exception()
    }
}