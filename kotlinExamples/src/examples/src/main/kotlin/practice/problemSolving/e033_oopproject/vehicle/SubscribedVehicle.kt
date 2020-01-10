package practice.problemSolving.e033_oopproject.vehicle

import practice.problemSolving.e033_oopproject.util.Subscription

class SubscribedVehicle(private var subscription: Subscription, private val plate: String) : Vehicle {

    override fun getSubscription() = subscription
    override fun getPlate() = plate
    override fun isOfficial() = false
    override fun toString() = "$plate - Subscribed\n"
}