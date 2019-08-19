package languageExamples.other.e015_ObserverPattern

class PrintChangeListener<T> : ValueChangedListener<T> {
    override fun onValueChanged(oldValue: T, newValue: T) {
        println("Value changed: $oldValue -> $newValue")
    }
}