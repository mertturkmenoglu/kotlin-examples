package languageExamples.delegates.e004_Observer

fun main() {
    val intValue = Container().apply { listener = PrintChangeListener() }

    with(intValue) {
        value = 1
        value = 2
        value++
    }
}