package languageExamples.coroutines.e010_BuildSequence

fun powerOfN(n: Int) = sequence {
    var a = 1
    yield(a)

    while (true) {
        a *= n
        yield(a)
    }
}

fun main() {
    powerOfN(2).take(10).forEach(::println)
}