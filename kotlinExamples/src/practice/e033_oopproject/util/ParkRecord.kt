package practice.e033_oopproject.util

import practice.e033_oopproject.vehicle.Vehicle

class ParkRecord(var enterTime: Time? = null, exitTime: Time? = null, var vehicle: Vehicle? = null) {
    var exitTime = exitTime
    set(value) {
        if (value?.getDifference(enterTime!!) != -1)
            field = value
    }

    fun getParkingDuration() = exitTime!!.getDifference(enterTime ?: Time())

    override fun toString() = "\n$vehicle\nEnter Time: $enterTime\nExit Time: $exitTime\n"
}