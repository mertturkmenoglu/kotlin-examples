package languageExamples.functional.e006_ScopingFunctions

data class Pair(var key: Int = 0, var value: String? = null) {
    fun getKey(arg: Int): Pair = apply { key = arg }
    fun getValue(arg: String?): Pair = apply { value = arg }
}