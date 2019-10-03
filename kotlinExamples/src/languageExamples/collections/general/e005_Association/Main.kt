package languageExamples.collections.general.e005_Association

fun main() {
    val range = 1..5

    val associate = range.associate { it + 1 to it + 2 }
    val associateBy = range.associateBy { it * it }  // Element becomes a value
    val associateWith = range.associateWith { it * it * it } // Element becomes a key

    println(associate)
    println(associateBy)
    println(associateWith)

}