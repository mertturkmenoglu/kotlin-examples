package typealiases.e002_TypeAliases

typealias Predicate<T> = (T) -> Boolean

fun main() {
    val myFilter: Predicate<Int> = { it.and(1) == 0 }   // (Int) -> Boolean
    val myFilter2 = { it: Int -> it.and(1) == 0 }       // (Int) -> Boolean

    (0..9)
        .apply { println(filter(myFilter)) }
        .apply { println(filter(myFilter2)) }
}