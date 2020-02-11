package practice.problemSolving.e107_HumanReadableTimeFormat

fun main() {
    val input = 147688
    val result = convertTime(seconds = input)
    println(result)
}

@Suppress("SameParameterValue")
private fun convertTime(seconds: Int): String {
    require(seconds in 0..359999) { "Invalid seconds" }

    val h = seconds / 3600
    val m = (seconds - h * 3600) / 60
    val s = seconds % 60

    return listOf(h, m, s).joinToString(separator = ":") {
        if (it.toString().length < 2) {
            "0$it"
        } else {
            it.toString()
        }
    }
}
