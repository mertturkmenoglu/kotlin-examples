package languageExamples.other.e015_ObserverPattern

import kotlin.properties.Delegates

class Container {
    var listener: PrintChangeListener<Int>? = null
    var value: Int by Delegates.observable(0) { _, oldValue, newValue ->
        listener?.onValueChanged(oldValue, newValue)
    }
}