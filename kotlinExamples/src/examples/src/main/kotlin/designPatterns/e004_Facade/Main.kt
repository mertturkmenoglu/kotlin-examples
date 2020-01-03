package designPatterns.e004_Facade

class Engine {
    fun stop() = println("Engine stops")

    fun accelerate(acceleration: Long) = println("Acceleration: $acceleration")

    fun operate() = println("Engine operates")
}

class Battery {
    fun charge(volt: Int): Double = volt * 3.0
}

class InternalElectricalSystem {
    fun status(gain: Double, consume: Double) = println("Gain: ${gain}V - Consume: ${consume}V")
}

class Car(private val engine: Engine = Engine(), private val battery: Battery = Battery(),
          private val internalElectricalSystem: InternalElectricalSystem = InternalElectricalSystem()) {
    companion object {
        const val INSTANT_ELECTRICAL_CONSUMPTION = 2.0
        const val CHARGE_RATE = 4
        const val ACCELERATION_RATE = 5L
    }

    fun start() {
        engine.stop()
        internalElectricalSystem.status(battery.charge(CHARGE_RATE), INSTANT_ELECTRICAL_CONSUMPTION)
        engine.accelerate(ACCELERATION_RATE)
        engine.operate()
    }
}

fun main() {
    val car = Car()
    car.start()
}