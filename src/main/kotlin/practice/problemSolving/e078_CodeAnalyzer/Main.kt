package practice.problemSolving.e078_CodeAnalyzer

import java.io.File

fun main() {
    val path = "PATH_TO_YOUR_FILE"
    val lines = File(path).readLines()
    val result = analyze(lines)
    println(result)
}

fun analyze(l: List<String>): Map<String, Int> {
    val a = l.map { it.replace("[^\\w\\s]|_".toRegex(), " ") }
    val b = a.map { it.split(" ").filterNot { ch -> ch == "" }.map { w -> w.trim() } }
    return b.filterNot { it.isEmpty() }.flatten().groupingBy { it }.eachCount()
}