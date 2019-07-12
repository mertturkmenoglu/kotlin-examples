package e040_oopproject.vehicle

import e040_oopproject.util.Subscription

interface Vehicle {
    fun getPlate(): String
    fun getSubscription(): Subscription?
    fun isOfficial(): Boolean
}