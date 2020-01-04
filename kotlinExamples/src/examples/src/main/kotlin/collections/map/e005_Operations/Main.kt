package collections.map.e005_Operations

fun main() {
    val map = mapOf("emily" to 1, "diana" to 2, "barbara" to 3)
    val withoutEmily = map.minus("emily")
    val withoutEmilyAndBarbara = map.minus(listOf("emily", "barbara").asIterable())
    val withoutEmilyAndDiana = map - sequenceOf("emily", "diana")
    val withSelina = map.plus("selina" to 4)
    val withSelinaAndDinah = map + listOf("selina" to 5, "dinah" to 6).asIterable()
    val withSelinaAndLois = map + sequenceOf("selina" to 5, "lois" to 6)

    println("Original map: $map")

    println("Without Emily(drop one element): $withoutEmily")
    println("Without Emily and Barbara(drop iterable): $withoutEmilyAndBarbara")
    println("Without Emily and Diana(drop sequence): $withoutEmilyAndDiana")

    println("With Selina(add one element): $withSelina")
    println("With Selina and Dinah(add iterable): $withSelinaAndDinah")
    println("With Selina and Lois(add sequence): $withSelinaAndLois")
}