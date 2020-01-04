package collections.general.e007_CollectionRetrieving

fun main() {
    val list = listOf("Emily", "Diana", "Barbara", "Selina", "Carol", "Natasha")

    // Slice
    println("[0..3]: ${list.slice(0..3)}")
    println("[0, 2 .. 4]: ${list.slice(0..4 step 2)}")
    println("[1]-[2]: ${list.slice(setOf(1, 2))}")

    // Take & Drop
    println("list.take(2): ${list.take(2)}")
    println("list.takeLast(2): ${list.takeLast(2)}")
    println("list.takeWhile { it.length < 6 }: ${list.takeWhile { it.length < 6 }}")
    println("list.takeLastWhile { it[0] != 'S' }: ${list.takeLastWhile { it[0] != 'S' }}")
    println("list.takeIf { it[0] == \"Emily\" }: ${list.takeIf { it[0] == "Emily" }}")
    println("list.takeUnless { it[0] == \"Emily\" }: ${list.takeUnless { it[0] == "Emily" }}")
    println("list.drop(2): ${list.drop(2)}")
    println("list.dropLast(2): ${list.dropLast(2)}")
    println("list.dropWhile { it.length < 6 }: ${list.dropWhile { it.length < 6 }}")
    println("list.dropLastWhile { it.startsWith('n', true) }: ${list.dropLastWhile { it.startsWith('n', true) }}")

    // Chunked
    println("Chunked(4): ${list.chunked(4)}")

    // Windowed
    println("Windowed: ${list.windowed(3)}")
}