package jvm.e001_JavaInteroperability

fun main() {
    Util.printString("Call Java function from Kotlin")
    val num = 3
    val square = Util.getSquare(num)
    println("$num x $num = $square")
}