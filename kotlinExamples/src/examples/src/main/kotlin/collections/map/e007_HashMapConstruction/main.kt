package languageExamples.collections.map.e007_HashMapConstruction

fun main() {
    val firstHashMap = HashMap<String, Int>()
    println("First map: $firstHashMap")

    val secondHashMap = HashMap<String, Int>(10)
    println("Second map: $secondHashMap")

    val thirdHashMap = HashMap<String, Int>(10, 3f)
    println("Third map: $thirdHashMap")

    val fourthHashMap = HashMap(mapOf("emily" to 1))
    println("Fourth map: $fourthHashMap")
}