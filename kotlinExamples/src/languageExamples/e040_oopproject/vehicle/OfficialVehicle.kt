package languageExamples.e040_oopproject.vehicle

import languageExamples.e040_oopproject.util.Subscription

class OfficialVehicle(private val plate: String): Vehicle {
    override fun getSubscription(): Subscription? = null
    override fun getPlate() = plate
    override fun isOfficial() = true
    override fun toString() = "$plate - Official\n"
}