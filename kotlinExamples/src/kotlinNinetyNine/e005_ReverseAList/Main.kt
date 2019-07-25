package kotlinNinetyNine.e005_ReverseAList

fun main() {
    val result = listOf(1, 2, 3, 4, 5).reverseOfTheList()
    println(result)
}

fun <T> List<T>.reverseOfTheList() = this.reversed()