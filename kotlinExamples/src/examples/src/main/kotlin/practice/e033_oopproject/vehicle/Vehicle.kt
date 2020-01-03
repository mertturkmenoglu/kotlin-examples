package practice.e033_oopproject.vehicle

import practice.e033_oopproject.util.Subscription

interface Vehicle {
    fun getPlate(): String
    fun getSubscription(): Subscription?
    fun isOfficial(): Boolean
}