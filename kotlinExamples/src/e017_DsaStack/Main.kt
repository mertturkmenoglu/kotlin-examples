package e017_DsaStack

class Values {
    companion object {
        var NegativeFlag = false
        var LastOperation = OperationType.OPERATOR
    }
}

fun main() {
    val operand = ArrayList<Int>()
    val operator = ArrayList<Char>()

    println("Enter arithmetic expression: ")
    val expression = readLine()!!

    val result = evaluateExpression(expression, operand, operator)
    println("Result of the arithmetic expression: $result")
}