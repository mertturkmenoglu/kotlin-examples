package languageExamples.collections.map.e002_Contains

fun main() {
    val map = mapOf("emily" to 1, "diana" to 2, "barbara" to 3)
    val result = map.contains("emily")
    println(result)

    val result2 = map.containsKey("emily")
    println(result2)

    val result3 = map.containsValue(2)
    println(result3)
}