package languageExamples.oop.e004_SealedClass

sealed class Expr
class Const(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
object NotANumber : Expr()

@Suppress("unused")
fun eval(e: Expr): Int =
    when (e) {
        is Const -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        NotANumber -> java.lang.Double.NaN.toInt()
    }
