package collections.map.e006_NonGenericMap

fun main() {
    val map = mapOf<Any, Any>("emily" to 1, 3.14 to "pi", Pair(1, 2) to 3.14f)

    map.forEach {
        println("${it.key.javaClass} - ${it.value.javaClass}")
    }
}