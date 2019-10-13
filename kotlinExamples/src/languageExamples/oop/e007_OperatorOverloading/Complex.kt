package languageExamples.oop.e007_OperatorOverloading

class Complex(var real: Double, var imaginary: Double) : Comparable<Complex> {
    constructor(real: Int, imaginary: Int) : this(real.toDouble(), imaginary.toDouble())
    constructor() : this(0.0, 0.0)

    override fun compareTo(other: Complex): Int {
        return if (this.real == other.real && this.imaginary == other.imaginary) {
            0
        } else if (this.length() < other.length()) {
            -1
        } else {
            1
        }
    }

    fun length() = kotlin.math.sqrt(real * real + imaginary * imaginary)

    operator fun plus(rhs: Complex) = Complex(this.real + rhs.real, this.imaginary + rhs.imaginary)
    operator fun minus(rhs: Complex) = Complex(this.real - rhs.real, this.imaginary - rhs.imaginary)
    override fun toString() = "$real ${if (imaginary > 0) "+ $imaginary" else if (imaginary == 0.0) " " else "- ${kotlin.math.abs(imaginary)}"}"
}