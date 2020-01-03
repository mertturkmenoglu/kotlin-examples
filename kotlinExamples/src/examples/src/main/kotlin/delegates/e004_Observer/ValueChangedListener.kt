package delegates.e004_Observer

interface ValueChangedListener<T> {
    fun onValueChanged(oldValue: T, newValue: T)
}