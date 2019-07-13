package languageExamples.e030_ScopingFunctions

data class Person(var name: String? = null, var age: Int = 0) {
    override fun toString() = "Name: $name\tAge: $age"
}