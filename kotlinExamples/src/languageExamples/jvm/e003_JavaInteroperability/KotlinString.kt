@file:JvmName("KotlinString")

package languageExamples.jvm.e003_JavaInteroperability

fun String.stringUpperPrint() {
    println(this.toUpperCase())
}

fun printStrings(l: List<String>) {
    for (e in l) {
        println(e)
    }
}