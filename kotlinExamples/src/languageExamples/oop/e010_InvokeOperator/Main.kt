package languageExamples.oop.e010_InvokeOperator

class Student {
    operator fun invoke(msg: String) {
        println(msg)
    }
}

fun main() {
    val std = Student()
    std("Hi")
}