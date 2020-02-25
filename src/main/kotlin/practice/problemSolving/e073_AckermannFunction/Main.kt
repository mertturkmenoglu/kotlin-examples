package practice.problemSolving.e073_AckermannFunction

fun main() {
    try {
        val result = ack(3, 12)
        println(result)
    } catch (e: StackOverflowError) {
        e.printStackTrace()
    }
}

fun ack(m: Int, n: Int): Int {
    return when {
        m == 0 -> n + 1
        n == 0 -> ack(m - 1, 1)
        else -> ack(m - 1, ack(m, n - 1))
    }
}