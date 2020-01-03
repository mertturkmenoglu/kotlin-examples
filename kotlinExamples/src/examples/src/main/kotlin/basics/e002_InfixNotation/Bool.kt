package basics.e002_InfixNotation

/**
 * An example class to demonstrate infix functions
 */
class Bool(var value: Boolean = false) {
    infix fun or(other: Bool): Boolean {
        return value or other.value
    }
}