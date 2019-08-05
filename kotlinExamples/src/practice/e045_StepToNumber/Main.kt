package practice.e045_StepToNumber

fun main() {
    val n = 12
    val result = steps(n)
    println(result)
}

fun steps(n: Int): List<Int> {
    var tmp = n
    val r = ArrayList<Int>().apply { add(tmp) }

    while (tmp != 1) {
        tmp = if (tmp % 2 == 0) tmp / 2 else tmp - 1
        r.add(tmp)
    }

    return r.reversed()
}