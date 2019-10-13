package languageExamples.functional.e016_Sequence

fun main() {
    val lazySequence = sequence {
        var i = 0
        yieldAll(i..i + 5)

        while (true) {
            i += 6
            yieldAll(i..i + 5)
        }
    }

    lazySequence.take(20).forEach(::println)
}