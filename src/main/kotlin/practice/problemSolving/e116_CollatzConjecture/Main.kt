package practice.problemSolving.e116_CollatzConjecture

fun main() {
    val input = 7
    val result = collatzConjecture(input)
    println(result.toList())
}

fun collatzConjecture(n: Int): Sequence<Long> {
    require(n >= 1) { "n must be equal to or greater than 1" }

    return sequence {
        var current = n.toLong()

        yield(current)

        while (current != 1L) {
            if (current % 2 == 0L) {
                current /= 2L
            } else {
                current = 3L * current + 1L
            }

            yield(current)
        }
    }
}