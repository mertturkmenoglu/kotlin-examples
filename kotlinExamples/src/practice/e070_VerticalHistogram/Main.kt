package practice.e070_VerticalHistogram

import java.util.*

fun main() {
    val l = arrayListOf(0, 0, 0, 0, 0, 0).apply {
        repeat((10 .. 50).random()) { this[(0..5).random()]++ }
    }

    printHistogram(l)
}

fun printHistogram(l: ArrayList<Int>) {
    val s = Stack<String>()
    val max = l.max() ?: throw Exception()

    for (i in 0 .. max) {
        val a = ArrayList<Char>().apply {
            repeat(6) { j -> add(if (l[j] >= (i+1)) '#' else ' ')}
        }

        s.push(a.joinToString(""))
    }

    s.reversed().forEachIndexed { i, str -> println("${max-i+1} \t $str")}
    println("\n\n$l")
}
