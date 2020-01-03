package practice.e090_Sort

fun main() {
    val input = listOf(3, 7, -1, 0, 3, 2, 2, 1, 0, 9, 13, 15, 14)
    println(input)
    println(qSort(input))
    println(mergeSort(input))
}

fun <T : Comparable<T>> qSort(l: List<T>): List<T> = if (l.size < 2) l else l.drop(1).partition { it <= l.first() }.run { qSort(first) + l.first() + qSort(second) }

fun <T : Comparable<T>> mergeSort(l: List<T>): List<T> = if (l.size < 2) l else merge(mergeSort(l.subList(0, l.size / 2)), mergeSort(l.subList(l.size / 2, l.size)))

tailrec fun <T : Comparable<T>> merge(fst: List<T>, snd: List<T>, result: ArrayList<T> = arrayListOf()): List<T> {
    return when {
        fst.isEmpty() && snd.isEmpty() -> result
        fst.isEmpty() -> merge(fst, snd.drop(1), result.apply { add(snd.first()) })
        snd.isEmpty() -> merge(fst.drop(1), snd, result.apply { add(fst.first()) })
        else -> when {
            fst.first() <= snd.first() -> merge(fst.drop(1), snd, result.apply { add(fst.first()) })
            else -> merge(fst, snd.drop(1), result.apply { add(snd.first()) })
        }
    }
}

