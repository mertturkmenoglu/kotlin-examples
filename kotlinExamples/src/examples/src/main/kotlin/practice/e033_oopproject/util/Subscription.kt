package practice.e033_oopproject.util

import practice.e033_oopproject.vehicle.SubscribedVehicle

class Subscription(private var begin: Date, var end: Date, @Suppress("CanBeParameter") private val plate: String) {
    @Suppress("unused")
    private var vehicle = SubscribedVehicle(this, plate)

    fun isValid() = Date.getToday().isAfterThan(begin) && Date.getToday().isBeforeThan(end) || Date.getToday().isEqualsWith(begin) || Date.getToday().isEqualsWith(end)
}