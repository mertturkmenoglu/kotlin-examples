package practice.problemSolving.e080_CinemaLine

fun main() {
    val input = listOf(25, 25, 50, 50, 100)
    val result = tickets(input)
    println(result)
}

fun tickets(line: List<Int>): Boolean {
    var register = 0

    for (bill in line) {
        register += 25

        if (bill != 25)
            register -= bill

        if (register < 0)
            return false
    }

    return true
}