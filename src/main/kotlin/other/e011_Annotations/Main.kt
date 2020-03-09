package other.e011_Annotations

@Target(AnnotationTarget.FIELD,
        AnnotationTarget.PROPERTY,
        AnnotationTarget.LOCAL_VARIABLE,
        AnnotationTarget.VALUE_PARAMETER)
internal annotation class Positive

@Target(AnnotationTarget.FIELD,
        AnnotationTarget.PROPERTY,
        AnnotationTarget.LOCAL_VARIABLE,
        AnnotationTarget.VALUE_PARAMETER)
internal annotation class NotBlankString

data class Person(@NotBlankString val name: String, @Positive val age: Int)

fun main() {
    val emily = Person("Emily", 35)
    val notEmily = Person("", -1)

    val isValid1 = Validate.person(emily)
    val isValid2 = Validate.person(notEmily)

    println("$emily is ${ if (isValid1) "valid" else "not valid" }")
    println("$notEmily is ${ if (isValid2) "valid" else "not valid" }")

    @Positive val v = -1
    println("Is v valid: ${Validate.isValidPositive(v)}")
}