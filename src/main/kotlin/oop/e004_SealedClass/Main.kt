package oop.e004_SealedClass

sealed class Expr
class Const(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
object NotANumber : Expr()

@Suppress("unused")
fun eval(e: Expr): Int =
        when (e) {
            is Const -> e.value
            is Sum -> eval(e.right) + eval(e.left)
            NotANumber -> Double.NaN.toInt()
        }

fun main() {
    println(eval(Const(5)))
    println(eval(Sum(Const(3), Const(4))))
    println(eval(NotANumber))
}