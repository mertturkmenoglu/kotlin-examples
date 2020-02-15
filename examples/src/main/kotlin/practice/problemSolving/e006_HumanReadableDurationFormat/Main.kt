package practice.problemSolving.e006_HumanReadableDurationFormat

fun format(n: Int): String {
    require(n >= 0) { "Can not operate on negative value" }

    if (n == 0) return "Now"

    val y = TimeUnit("year", Int.MAX_VALUE)
    val d = TimeUnit("day", 365)
    val h = TimeUnit("hour", 24)
    val m = TimeUnit("minute", 60)
    val s = TimeUnit("second", 60)

    val l = listOf(y, d, h, m, s)
    var time = n

    while (time > 0) {
        if (time >= 60) {
            l.last() += 60
        } else {
            l.last().value = time % 60
        }

        l.drop(1).reversed().forEachIndexed { i, e ->
            if (e.value >= e.mod) {
                l.reversed()[i + 1] += 1
                e.resetValue()
            }
        }

        time -= 60
    }

    val sb = StringBuilder()
    for (e in l.dropLast(1)) {
        if (e.value != 0)
            sb.append("${e.value} ${e.name}${if (e.value > 1) "s" else ""}, ")
    }

    val trimmed = sb.trim { it == ' ' || it == ',' }.toString()
    val tail =
            if (l.last().value != 0)
                " ${if (sb.isNotEmpty()) "and " else ""}${l.last().value} second${if (l.last().value > 1) "s" else ""}"
            else
                ""

    return (trimmed + tail).trim()
}

fun main() {
    println(format(42))
    println(format(60))
    println(format(62))
    println(format(3662))
    println(format(90061))
    println(format(742985290))
}