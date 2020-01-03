package algorithms.sort.e001_ShellSort

fun main() {
    val list = listOf(9, 2, 1, 3, 0, 4, 8, 7, 6, 5)
    val sorted = shellSort(list)

    println(list)
    println(sorted)
}

private fun <T : Comparable<T>> shellSort(l: List<T>): List<T> {
    return l.toMutableList().apply { shellSortHelper() }
}

private fun <T : Comparable<T>> MutableList<T>.shellSortHelper() {
    var gap = this.size / 2

    while (gap > 0) {
        for (i in gap until this.size) {
            val temp = this[i]
            var j = i

            while (j >= gap && this[j - gap] > temp) {
                this[j] = this[j - gap]
                j -= gap
            }

            this[j] = temp
        }

        gap /= 2
    }
}