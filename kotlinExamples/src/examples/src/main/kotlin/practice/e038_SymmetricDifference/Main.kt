package practice.e038_SymmetricDifference

fun main() {
    val first = setOf(1, 2, 3, 4)
    val second = setOf(3, 4, 5)
    val result = symmetricDifference(first, second)
    println(result)
}

fun symmetricDifference(first: Set<Int>, second: Set<Int>) = first + second - first.intersect(second)