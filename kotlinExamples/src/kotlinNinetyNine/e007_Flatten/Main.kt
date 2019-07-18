package kotlinNinetyNine.e007_Flatten

fun main() {
    val a = listOf(listOf(1, 2), listOf(2), listOf(3, listOf(5, 8)))
    val result = flatten(a)
    println(result)
}

fun flatten(list: List<List<Any>>) = list.flatten()