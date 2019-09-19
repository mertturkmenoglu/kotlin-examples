package languageExamples.jvm.e001_JavaInteroperability

fun trianglePerimeter(a: Double, b: Double, c: Double) = a * b * c

fun printArray(arr: Array<Int>) {
    print(arr.asList())
}