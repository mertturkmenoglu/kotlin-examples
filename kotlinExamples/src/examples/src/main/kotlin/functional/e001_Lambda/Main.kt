package functional.e001_Lambda

fun <T> foreach(array: Array<T>, func: (T) -> Unit) {
    for (e in array) {
        func(e)
    }
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5, 6)

    foreach(arr) { num: Int -> println(num) }
    foreach(arr) { num: Int -> println(num * num) }
}