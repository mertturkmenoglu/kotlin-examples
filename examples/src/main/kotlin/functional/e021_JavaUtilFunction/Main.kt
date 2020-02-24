package functional.e021_JavaUtilFunction

import java.util.function.Function

fun main() {
    val javaFunction = returnJavaFunction(3)
    println(javaFunction.apply(3))
}

fun returnJavaFunction(a: Int): Function<Int, String> {
    return Function {
        if (a == 1) "one" else "other"
    }
}