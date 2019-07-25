@file:Suppress("SpellCheckingInspection")

package practice.e004_WordSeparate

val menu = listOf("Burger", "Fries", "Chicken", "Pizza", "Sandwich", "Onionrings", "Milkshake", "Coke")

fun getOrders(str: String): String {
    var result = ""
    var tmp = str

    while (tmp.length > menu.minBy { it.length }!!.length) {
        result += menu.find { tmp.startsWith(it.decapitalize()) }
                .also { tmp = tmp.drop(it!!.length) }
        result += ' '
    }

    return result.dropLast(1)
}

fun main() {
    println(getOrders("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"))
}