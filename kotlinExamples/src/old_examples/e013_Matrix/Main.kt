package old_examples.e013_Matrix

fun main() {
    val n = readLine()!!.toInt()
    val mtr = Array(n) {Array(n) {0}}

    for (i in 0 until n) {
        for (j in 0 until n) {
            mtr[i][j] = readLine()!!.toInt()
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${mtr[i][j]}\t")
        }
        println()
    }

}