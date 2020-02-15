package other.e010_InlineFunction

private inline fun <T> Collection<T>.forEachElement(action: (T) -> Unit) {
    for (e in this)
        action(e)
}

fun main() {
    val names = listOf("Emily", "Diana", "Barbara", "Selina", "Carol")
    names.forEach { println(it) }
    names.forEachElement(::println)
}