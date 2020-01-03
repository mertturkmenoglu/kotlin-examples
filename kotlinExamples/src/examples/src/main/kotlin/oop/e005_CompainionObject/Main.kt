package oop.e005_CompainionObject

class Math {
    @Suppress("unused")
    private val pi: Double = 3.1415

    companion object A {
        fun introduce() {
            println("I am kinda Java static method.")
            println("But we are different in many ways")
        }
    }
}

fun main() {
    Math.introduce()
}