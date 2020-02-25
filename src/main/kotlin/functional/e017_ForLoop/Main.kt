package functional.e017_ForLoop

fun main() {
    (0..10).forLoopIndexed(::println)
}

private inline fun IntRange.forLoopIndexed(f: (Int) -> Unit) {
    for (i in this) {
        f(i)
    }
}
