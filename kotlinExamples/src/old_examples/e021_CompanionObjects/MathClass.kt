package old_examples.e021_CompanionObjects

class MathClass {
    companion object {
        fun printPI() = println("PI: ${Math.PI}")
        fun printE() = println("E: ${Math.E}")
    }
}