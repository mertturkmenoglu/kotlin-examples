package jvm.e006_TypeErasure

/**
 * Because of the type erasure on generic types, we cannot write
 * <code>fun operate(elements: List<String>): String</code>
 * <code>fun operate(elements: List<Int>): String</code>
 *
 * We can use @JvmName annotation and rename functions
 */
@JvmName("operateString")
private fun operate(elements: List<String>): String {
    return elements.joinToString(separator = " ")
}

@JvmName("operateInt")
private fun operate(elements: List<Int>): String {
    return "Value: ${ elements.reduce { acc, i -> acc + i } }"
}

fun main() {
    println(operate(listOf("Emily", "Diana", "Barbara")))
    println(operate(listOf(1, 2, 3, 4)))
}