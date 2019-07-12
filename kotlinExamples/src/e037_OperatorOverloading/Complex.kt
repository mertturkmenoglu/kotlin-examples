package e037_OperatorOverloading

class Complex(var real: Double, var imag: Double) : Comparable<Complex> {
    constructor(real: Int, imag: Int) : this(real.toDouble(), imag.toDouble())
    constructor() : this(0.0, 0.0)

    override fun compareTo(other: Complex): Int {
        return if (this.real == other.real && this.imag == other.imag) {
            0
        } else if (this.length() < other.length()) {
            -1
        } else {
            1
        }
    }

    fun length() = kotlin.math.sqrt(real * real + imag * imag)

    operator fun plus(rhs: Complex) = Complex(this.real + rhs.real, this.imag + rhs.imag)
    operator fun minus(rhs: Complex) = Complex(this.real - rhs.real, this.imag - rhs.imag)
    override fun toString() = "$real ${if (imag > 0) "+ $imag" else if (imag == 0.0) " " else "- ${kotlin.math.abs(imag)}"}"
}