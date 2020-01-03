package dsl.e002_Invoke

fun main() {
    val num = NumberWrapper(7)
    num {
        if (7.isEqual())
            println("Value is 7")
        else
            println("Not equal")
    }
}