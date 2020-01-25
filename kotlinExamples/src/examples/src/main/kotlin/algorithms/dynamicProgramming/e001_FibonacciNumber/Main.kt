package algorithms.dynamicProgramming.e001_FibonacciNumber

fun fibonacci(n: Int): Int {
    return fib(n, mutableListOf(0, 1))
}

private fun fib(n: Int, fibList: MutableList<Int>): Int {
    while (fibList.size <= n) {
        fibList.add(0)
    }

    return if (n <= 1) {
        n
    } else {
        if (fibList[n-1] == 0) {
            fibList[n-1] = fib(n-1, fibList)
        }

        if (fibList[n-2] == 0) {
            fibList[n-2] = fib(n-2, fibList)
        }

        fibList[n] = fibList[n-1] + fibList[n-2]
        fibList[n]
    }
}


fun main() {
    println(fibonacci(9))
}