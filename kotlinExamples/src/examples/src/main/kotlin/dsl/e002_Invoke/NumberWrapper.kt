package dsl.e002_Invoke

class NumberWrapper(val value: Number) {
    operator fun <R> invoke(block: NumberWrapper.() -> R) = block()
    fun Number.isEqual() = this == value
}