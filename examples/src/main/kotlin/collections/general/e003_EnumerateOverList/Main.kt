package collections.general.e003_EnumerateOverList

fun main() {
    val list = listOf("Emily", "Diana", "Barbara", "Selina")

    // Iterating like C style
    for (i in list.indices) {
        println("Index: $i Value: ${list[i]}")
    }

    println("----")

    // For-each loop style with a helper index variable
    var index = 0
    for (e in list) {
        println("Index: ${index++} Value: $e")
    }

    println("----")

    // Enumeration
    for ((i, e) in list.withIndex()) {
        println("Index: $i Value: $e")
    }
}