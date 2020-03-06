package collections.builders.e003_BuildMap

@OptIn(ExperimentalStdlibApi::class)
@Suppress("RemoveExplicitTypeArguments")
fun main() {
    val input = "Emily is the best in the world... No universe!!!"

    val numbers = buildMap<Char, Int> {
        input.groupBy { it }.map { it.key to it.value.count() }.forEach {
            this[it.first] = it.second
        }
    }

    println(numbers)
}