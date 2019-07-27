package practice.e016_HammingDistance

fun calculate(first: String, second: String): Int {
    return if (first.length != second.length)
        throw Exception("Unequal length of DNA strings")
    else
        first.zip(second).count { it.first != it.second }
}

fun main() {
    println(calculate("ATGCAATCGCGAAT", "ATGCGATGGCGATT"))
}