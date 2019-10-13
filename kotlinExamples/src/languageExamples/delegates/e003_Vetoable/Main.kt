package languageExamples.delegates.e003_Vetoable

import kotlin.properties.Delegates.vetoable

fun main() {
    var counter: Int by vetoable(initialValue = 5) { property, oldValue, newValue ->
        println(oldValue)
        newValue < 10
    }

    @Suppress("ReplaceWithOperatorAssignment")
    for (i in 0..10) {
        counter = counter + 1
    }
}