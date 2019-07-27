package languageExamples.collections.map.e004_Conversion

fun main() {
    val map = mapOf("emily" to 1, "diana" to 2, "barbara" to 3)
    val seq = map.asSequence()
    val itr = map.asIterable()

    val iterator = map.iterator()

    seq.forEach { println(it) }
    repeat(3) { println("---") }

    itr.forEach { println(it) }
    repeat(3) { println("---") }

    while(iterator.hasNext()) {
        println(iterator.next())
    }
}