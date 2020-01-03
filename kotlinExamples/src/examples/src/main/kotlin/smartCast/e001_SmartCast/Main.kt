package smartCast.e001_SmartCast

fun main() {
    // Let's define a nullable string
    val message: String? = "Emily"

    // You can not access the property like non-nullable objects
    // Compiler error
    // println(message.length)

    // You must use the null-safe operator
    println(message?.length)

    // Let's do a null check
    if (message != null) {
        // Now message is smart casted. Compiler knows, in this context
        // message is not null. So we can use the normal property access syntax
        // IntelliJ will give a hint and say "Smart cast to kotlin.String"
        println(message.length)
    }
}