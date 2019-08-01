package languageExamples.other.e010_JVMStatic

// Using companion object
class Main {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println("Ni!")
        }
    }
}

// Or object declaration
object App {
    @JvmStatic fun main(args: Array<String>) {
        println("Ni!")
    }
}
