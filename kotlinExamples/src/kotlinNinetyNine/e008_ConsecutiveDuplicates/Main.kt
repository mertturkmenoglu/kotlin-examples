package kotlinNinetyNine.e008_ConsecutiveDuplicates

@Suppress("SpellCheckingInspection")
fun main() {
    val result = "aaaabccaadeeee".toList().compress()
    println(result)
}

fun <T> List<T>.compress(): List<T> {
    val result = ArrayList<T>()
    result.add(this.first())

    this.drop(1).forEach {
        if (it != result.last())
            result.add(it)
    }

    return result
}