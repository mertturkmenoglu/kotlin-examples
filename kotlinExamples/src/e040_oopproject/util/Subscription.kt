package e040_oopproject.util

import e040_oopproject.vehicle.SubscribedVehicle

class Subscription(var begin: Date, var end: Date, val plate: String) {
    private var vehicle = SubscribedVehicle(this, plate)

    fun isValid() = Date.getToday().isAfterThan(begin) && Date.getToday().isBeforeThan(end) || Date.getToday().isEqualsWith(begin) || Date.getToday().isEqualsWith(end)
}