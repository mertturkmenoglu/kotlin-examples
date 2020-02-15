package functional.e018_Sum

fun main() {
    println( sum  (3) (5) )
    println( sum2 (3) (5) )
    println( sum3 (3) (5) )
}

fun sum(a: Int): (Int) -> Int {
    return fun(b: Int): Int {
        return a + b
    }
}

fun sum2(a: Int) = fun(b: Int): Int = a + b

fun sum3(a: Int) = { b: Int -> a + b }