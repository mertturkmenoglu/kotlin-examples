package dsl.e005_DSL

data class User(var name: String)

fun createUser(init: User.() -> Unit) = User("").apply(init)

inline fun User.confirm(confirmation: (User) -> Boolean) = confirmation(this)

infix fun User.isNot(otherUserName: String) = this.name != otherUserName

infix fun <R> Boolean.then(op: () -> R): Boolean {
    if (this) op()
    return this
}

inline fun <R> Boolean.fail(abortCallback: () -> R): Boolean {
    if (!this) abortCallback()
    return this
}

fun main() {
    createUser { name = "Emily" }
            .confirm { it isNot "Diana" }
            .then {
                println("Confirm: True")
            }
            .fail {
                println("Confirm: False")
            }
}