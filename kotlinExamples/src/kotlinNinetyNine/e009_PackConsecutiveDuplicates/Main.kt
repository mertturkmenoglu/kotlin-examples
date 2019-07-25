package kotlinNinetyNine.e009_PackConsecutiveDuplicates

fun main() {
    val result = "aaaabccaadeeee".toList().pack()
    println(result)
}

fun <T> List<T>.pack(): List<MutableList<T>> {
    val result = ArrayList<MutableList<T>>()
    result.add(mutableListOf(this.first()))

    this.drop(1).forEach {
        if (it == result.last().first())
            result.last().add(it)
        else
            result.add(mutableListOf(it))
    }

    return result
}

