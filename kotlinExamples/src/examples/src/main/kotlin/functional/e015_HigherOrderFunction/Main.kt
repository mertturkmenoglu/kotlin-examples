package functional.e015_HigherOrderFunction

fun main() {
    val l = listOf(1, 2, 3)
    val s = setOf(1, 2, 3)
    val m = mapOf(1 to "one", 2 to "two", 3 to "three")

    println(l.filter { it > 1 })
    println(s.filter { it > 1 })
    println(m.filter { it.key > 1 })

    println(filter(l) { it > 1 })
    println(filter(s) { it > 1 })
    println(filter(m.entries) { it.key > 1 })

    println(l.map { it + 1 })
    println(s.map { it + 1 })
    println(m.map { it.key + 1 })

    println(map(l) { it + 1 })
    println(map(s) { it + 1 })
    println(map(m.entries) { it.key + 1 })
}

