package languageExamples.collections.map.e001_GetValue

fun main() {
    val map = mapOf(Pair("emily", 1), Pair("diana", 2), Pair("barbara", 3))
    val value = map.getValue("emily")
    println(value)

    val value2 = map["emily"]
    println(value2)
}