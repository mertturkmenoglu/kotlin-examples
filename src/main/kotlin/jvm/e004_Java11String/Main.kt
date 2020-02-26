package jvm.e004_Java11String

// TODO: GitHub Build action fails when
// In Gradle file, Kotlin JVM target must be 1.8
fun main() {
    val a = java.lang.String(" = ") // Java String
    val b = " = " // Kotlin String

    // println("!!" + a.strip() + "!!")
    // println("!!" + b.strip() + "!!") // Kotlin version is deprecated

    // println("!!" + a.stripLeading() + "!!")
    // println("!!" + b.stripLeading() + "!!") // Kotlin version is deprecated

    println(a.repeat(2)) // Java method is from java.lang.String class(method)
    println(b.repeat(2)) // Kotlin method is from CharSequence class(Extension function)

    println("abc\nabc\nabc".lines())
    // println(a.isBlank) // Property (method)
    println(a.isEmpty) // Property (method)

    println(b.isBlank()) // Extension function
    println(b.isEmpty()) // Extension function
}