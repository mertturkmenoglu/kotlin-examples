package e008_CompainionObject

class Math {
    private val PI: Double = 3.1415

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