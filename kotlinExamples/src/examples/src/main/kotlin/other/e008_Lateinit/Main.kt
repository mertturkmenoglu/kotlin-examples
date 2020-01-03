package other.e008_Lateinit

fun main() {
    LateInitTest().init("First")
    LateInitTest().init("Second")
}

class LateInitTest {
    lateinit var name: String

    fun init(name: String) {
        try {
            println(this.name)
        } catch (e: UninitializedPropertyAccessException) {
            System.err.println("Trying to access uninitialized property")
            Thread.sleep(100)
        }

        println("Before: ${this::name.isInitialized}")

        this.name = name

        println(this.name)
        println("After: ${this::name.isInitialized}")
    }
}