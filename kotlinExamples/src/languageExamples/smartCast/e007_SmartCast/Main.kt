package languageExamples.smartCast.e007_SmartCast

fun main() {
    smart(listOf(1, 2, 3))
    smart(arrayListOf(1, 2, 3))
}

fun smart(x: List<Int>) {
    if (x is ArrayList) {
        // Smart cast to ArrayList<Int>
        x.add(-1)
    }

    x.forEach(::println)
    println("----")
}