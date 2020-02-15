package practice.problemSolving.e068_MultiplicativePersistence

fun main() {
    val input = 277777788888899
    val result = persistence(input)
    println(result)
}

fun persistence(n: Long): Int {
    require(n > 0)
    return persistenceOfN(n)
}

tailrec fun persistenceOfN(n: Long, r: Int = 0): Int {
    return if (n.toString().length == 1)
        r
    else
        persistenceOfN(n.toString().fold(1) { acc: Long, c: Char -> acc * c.toString().toLong() }, r + 1)
}