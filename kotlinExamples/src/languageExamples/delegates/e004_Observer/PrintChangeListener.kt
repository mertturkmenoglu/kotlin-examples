package languageExamples.delegates.e004_Observer

class PrintChangeListener<T> : ValueChangedListener<T> {
    override fun onValueChanged(oldValue: T, newValue: T) {
        println("Value changed: $oldValue -> $newValue")
    }
}