package languageExamples.other.e015_ObserverPattern

fun main() {
    val intValue = Container().apply { listener = PrintChangeListener() }

    with(intValue) {
        value = 1
        value = 2
        value++
    }
}