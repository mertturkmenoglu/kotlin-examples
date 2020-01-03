package practice.e006_HumanReadableDurationFormat

data class TimeUnit(val name: String, val mod: Int, var value: Int = 0) {
    operator fun plus(other: Int): TimeUnit {
        return TimeUnit(name, mod, value + other)
    }

    operator fun plusAssign(other: Int) {
        value += other
    }

    operator fun inc(): TimeUnit {
        return TimeUnit(name, mod, value + 1)
    }

    operator fun minus(other: Int): TimeUnit {
        return TimeUnit(name, mod, value - other)
    }

    operator fun minusAssign(other: Int) {
        value -= other
    }

    fun resetValue() {
        value = 0
    }
}