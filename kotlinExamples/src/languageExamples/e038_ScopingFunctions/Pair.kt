package languageExamples.e038_ScopingFunctions

data class Pair(var key: Int = 0, var value: String? = null) {
    fun Key(arg: Int): Pair = apply { key = arg }
    fun Value(arg: String?): Pair = apply { value = arg }
}