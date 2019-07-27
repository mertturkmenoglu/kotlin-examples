package languageExamples.functional.e005_Repeat

fun main() {
    val nameList = ArrayList<String>()
    repeat(3) {
        nameList.add(readLine()!!)
    }

    nameList.forEach {
        println(it)
    }
}