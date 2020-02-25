package functional.e019_Sum

fun main() {
    println( sum (10) )
}

// sum :: Int -> Int
private fun sum(n: Int): Int =
    if (n <= 0)
        0
    else
        n + sum (n - 1)