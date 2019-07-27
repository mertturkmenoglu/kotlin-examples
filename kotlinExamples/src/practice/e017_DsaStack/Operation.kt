package practice.e017_DsaStack


import practice.e017_DsaStack.Values.Companion.LastOperation
import practice.e017_DsaStack.Values.Companion.NegativeFlag


fun typeOfChar(c: Char): CharType = when (c) {
    ' '-> CharType.SPACE
    in '0' .. '9' -> CharType.DIGIT
    in charArrayOf('+', '-', '*', '/', '(', ')') -> CharType.PUNCTUATION
    else -> CharType.WRONG
}


fun executeOperation(operator: ArrayList<Char>, operand: ArrayList<Int>) {
    val a = operand.removeAt(operand.lastIndex)
    val b = operand.removeAt(operand.lastIndex)

    when (operator.removeAt(operator.lastIndex)) {
        '+' -> operand.add(b + a)
        '-' -> operand.add(b - a)
        '*' -> operand.add(b * a)
        '/' -> operand.add(b / a)
        else -> throw Exception("Invalid input")
    }
}


fun eval(c: Char, operator: ArrayList<Char>, operand: ArrayList<Int>) {
    var tmp = 'a'

    if ((c == '-') && (LastOperation == OperationType.OPERATOR)) {
        LastOperation = OperationType.OPERAND
        NegativeFlag = true
        return
    }

    if (c == '(') {
        LastOperation = OperationType.OPERATOR
        operator.add(c)
        return
    }

    if (c == ')') {
        while (tmp != '(') {
            executeOperation(operator, operand)
            tmp = operator[operator.lastIndex]
        }
        operator.removeAt(operator.lastIndex)
        return
    }

    operatorEval(c, operator, operand)
}


fun operatorEval(c: Char, operator: ArrayList<Char>, operand: ArrayList<Int>) {
    val tmp: Char
    val flag = true

    if (operator.isNotEmpty()) {
        tmp = operator[operator.lastIndex]
        if ((tmp != '(') && (tmp != ')')) {
            val p = compare(c, tmp)
            operate(c, p, flag, operator, operand)
        }
    }
    operator.add(c)
}


fun operate(c: Char, precedence: Precedence, flag: Boolean, operator: ArrayList<Char>, operand: ArrayList<Int>) {
    var f = flag
    var peek: Char
    var p = precedence

    while (((p == Precedence.LOWER) || (p == Precedence.EQUAL)) && (f)) {
        executeOperation(operator, operand)
        peek = operator[operator.lastIndex]
        if ((peek != '(') && (peek != ')')) {
            p = compare(c, peek)
        } else {
            f = false
        }
    }
}



fun compare(input: Char, peekValue: Char): Precedence {
    if (input == '/') {
        return when (peekValue) {
            '/' -> Precedence.EQUAL
            '*' -> Precedence.EQUAL
            '+' -> Precedence.HIGHER
            '-' -> Precedence.HIGHER
            else -> Precedence.LOWER
        }
    }

    if (input == '*') {
        return when (peekValue) {
            '/' -> Precedence.EQUAL
            '*' -> Precedence.EQUAL
            '+' -> Precedence.HIGHER
            '-' -> Precedence.HIGHER
            else -> Precedence.LOWER
        }
    }

    if (input == '+') {
        return when (peekValue) {
            '/' -> Precedence.LOWER
            '*' -> Precedence.LOWER
            '+' -> Precedence.EQUAL
            '-' -> Precedence.EQUAL
            else -> Precedence.LOWER
        }
    }

    if (input == '-') {
        return when (peekValue) {
            '/' -> Precedence.LOWER
            '*' -> Precedence.LOWER
            '+' -> Precedence.EQUAL
            '-' -> Precedence.EQUAL
            else -> Precedence.LOWER
        }
    }

    return Precedence.HIGHER
}


fun digitHandler(exp: String, index: Int): ReturnType {
    var i = index
    val len = exp.length
    var str = ""

    while ((i < len) && (exp[i] in '0'..'9')) {
        str += exp[i]
        i++
    }
    return ReturnType(i, str.toInt())
}


fun evaluateExpression(exp: String, operand: ArrayList<Int>, operator: ArrayList<Char>): Int {
    val len = exp.length
    var tmp: Int
    var i = 0

    if (exp[i] == '-') {
        NegativeFlag = true
        i++
    }


    while (i < len) {
        when (typeOfChar(exp[i])) {
            CharType.SPACE -> i++
            CharType.DIGIT -> {
                val result = digitHandler(exp, i)
                i = result.i
                tmp = result.number
                if (NegativeFlag) {
                    NegativeFlag = false
                    tmp = -tmp
                }
                LastOperation = OperationType.OPERAND
                operand.add(tmp)
                printStackStatus(operand, operator)
            }
            CharType.PUNCTUATION -> {
                eval(exp[i], operator, operand)
                printStackStatus(operand, operator)
                i++
            }
            CharType.WRONG -> throw Exception("Invalid input")
        }
    }

    while (operand.lastIndex != 0) {
        executeOperation(operator, operand)
        printStackStatus(operand, operator)
    }

    return operand[0]
}


fun <T> printStack(s: ArrayList<T>) {
    println("Stack: ")
    for (element in s) {
        print(element)
        print("\t")
    }
    println()
}


fun printStackStatus(operand: ArrayList<Int>, operator: ArrayList<Char>) {
    printStack(operand)
    printStack(operator)
    println("--------")
}