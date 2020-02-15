package functional.e018_Add

fun main() {
    println( add  (3) (5) )
    println( add2 (3) (5) )
    println( add3 (3) (5) )
}

fun add(a: Int): (Int) -> Int {
    return fun(b: Int): Int {
        return a + b
    }
}

fun add2(a: Int) = fun(b: Int): Int = a + b

fun add3(a: Int) = { b: Int -> a + b }