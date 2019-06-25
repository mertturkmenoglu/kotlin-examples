package e013_JavaInteroperability

fun trianglePerimeter(a: Double, b: Double, c: Double) = a * b * c

fun printArray(arr: Array<Int>) {
    print(arr.asList())
}