package languageExamples.oop.e007_OperatorOverloading

fun main() {
    val c1 = Complex(3, 4)
    println(c1)

    val c2 = Complex(5, -12)
    println(c2)

    val c3 = c2 - c1
    println(c3)

    if (c2 < c1) {
        println("$c2 is less than $c1")
    } else {
        println("$c2 is equal to or greater then $c1")
    }
}