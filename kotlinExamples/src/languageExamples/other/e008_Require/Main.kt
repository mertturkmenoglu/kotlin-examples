package languageExamples.other.e008_Require

fun test(n: Int) {
    require(n in 0..9)
    println("Digit: $n")
}

fun main() {
    test(1)
    test(5)
    test(10)
}