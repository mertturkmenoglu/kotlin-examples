package languageExamples.e040_oopproject.vehicle

import languageExamples.e040_oopproject.util.Subscription

interface Vehicle {
    fun getPlate(): String
    fun getSubscription(): Subscription?
    fun isOfficial(): Boolean
}