package languageExamples.collections.map.e003_GetOrDefault

fun main() {
    val map = mapOf("emily" to 1, "diana" to 2, "barbara" to 3)
    val result1 = map.getOrDefault("barbara", -1)   // Should return 3
    val result2 = map.getOrDefault("selina", -1)    // Should return -1

    println(result1)
    println(result2)
}