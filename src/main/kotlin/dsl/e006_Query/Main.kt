package dsl.e006_Query

import kotlin.reflect.KProperty1

data class Employee(
        var id: Int = 0,
        var firstName: String? = null,
        var lastName: String? = null
)

fun employeeList() = listOf(
        Employee(1, "John", "Smith"),
        Employee(2, "John", "Black"),
        Employee(3, "Amelia", "Pond")
)

// TODO: Add property selection
inline fun <reified T: Any> List<T>.select(vararg properties: KProperty1<T, *>, data: List<T>.() -> List<T>): List<T> {
    return data()
}

fun <T> from(source: List<T>, query: List<T>.() -> List<T>): List<T> {
    return source.query()
}

fun <T> List<T>.orderBy(vararg selectors: (T) -> Comparable<*>?): List<T> {
    return this.sortedWith(compareBy(*selectors))
}

fun <T> List<T>.where(predicate: T.() -> Boolean): List<T> {
    return this.filter(predicate)
}

fun main() {
    /*
        SELECT firstName, lastName FROM employeeList
        WHERE firstName = "John" AND lastName = "Black"
        ORDER BY id;
     */
    val cursor = from(employeeList()) {
        select(Employee::firstName, Employee::lastName) {
            where { (firstName == "John") and (lastName == "Black") }.orderBy(Employee::id)
        }
    }

    cursor.forEach(::println)
}