package practice.e088_MergeSortedLists

fun main() {
    val fst = listOf(1, 2, 3, 5, 9, 13, 27)
    val snd = listOf(2, 4, 6, 10, 13, 25, 29, 32)
    val result = merge(fst, snd)

    println(fst)
    println(snd)
    println(result)
}

fun <T: Comparable<T>> merge(fst: List<T>, snd: List<T>): List<T> {
    val result = ArrayList<T>()
    var i = 0
    var j = 0

    while (i < fst.size && j < snd.size) {
        result.add(if (fst[i] <= snd[j]) fst[i++] else snd[j++])
    }

    result.addAll(fst.drop(i) + snd.drop(j))

    return result
}