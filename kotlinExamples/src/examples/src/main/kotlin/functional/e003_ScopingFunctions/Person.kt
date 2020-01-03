package functional.e003_ScopingFunctions

data class Person(var name: String? = null, var age: Int = 0) {
    override fun toString() = "Name: $name\tAge: $age"
}