package languageExamples.other.e015_ObserverPattern

interface ValueChangedListener <T> {
    fun onValueChanged(oldValue: T, newValue: T)
}