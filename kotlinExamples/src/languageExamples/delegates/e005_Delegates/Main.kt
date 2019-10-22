package languageExamples.delegates.e005_Delegates

import kotlin.properties.Delegates

fun main() {
    // Lazy block will be postponed until it is needed to do some operation
    val lazyDelegate: String by lazy {
        println("Init")
        "String Value"
    }

    println(lazyDelegate)
    println(lazyDelegate)

    // This delegate will observe the variable and will call the block when it's value changes
    var observableDelegate: String by Delegates.observable("Init") { property, oldValue, newValue ->
        println("--------")
        println("Property: ${property.name}")
        println("From: $oldValue")
        println("To: $newValue")
        println("--------")
    }

    observableDelegate = "First"
    println(observableDelegate)

    observableDelegate = "Second"
    println(observableDelegate)

    // This delegate will observe the variable and will update it's value if the new value satisfies the given condition
    var vetoableDelegate: Int by Delegates.vetoable(5) { property, oldValue, newValue ->
        println("--------")
        println("Property: ${property.name}")
        println("From: $oldValue")
        println("To: $newValue")
        println("--------")
        newValue >= oldValue
    }

    vetoableDelegate = -5
    println(vetoableDelegate)

    vetoableDelegate = 10
    println(vetoableDelegate)
}