package other.e005_ParallelStream

fun main() {
    listOf(2, 3, 5, 7, 11, 13, 17).parallelStream().forEach(::showNumber)
}

fun showNumber(n: Int) {
    Thread.sleep(500)
    println(n)
}