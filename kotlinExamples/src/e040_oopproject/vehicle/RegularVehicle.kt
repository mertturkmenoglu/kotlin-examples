package e040_oopproject.vehicle

import e040_oopproject.util.Subscription

class RegularVehicle(private val plate: String) : Vehicle {
    override fun getSubscription(): Subscription? = null
    override fun getPlate() = plate
    override fun isOfficial() = false
    override fun toString() = "$plate - Regular\n"

}