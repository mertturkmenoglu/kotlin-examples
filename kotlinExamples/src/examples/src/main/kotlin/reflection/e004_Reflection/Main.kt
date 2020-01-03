package reflection.e004_Reflection

import kotlin.reflect.full.createInstance

fun main() {
    val type = Car::class
    val car = type.createInstance()

    val method = car::increaseSpeed
    method.invoke(5)

    val field = car::speed
    val speed = field.get()
    println(speed)
}