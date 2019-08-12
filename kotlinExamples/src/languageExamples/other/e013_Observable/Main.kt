package languageExamples.other.e013_Observable

import kotlin.properties.Delegates.observable

fun main() {
    var counter: Int by observable(initialValue = 0) { property, oldValue, newValue ->
        println("${property.name}: $oldValue -> $newValue")
    }

    for (i in 5..10) {
        counter = counter + i
    }
}