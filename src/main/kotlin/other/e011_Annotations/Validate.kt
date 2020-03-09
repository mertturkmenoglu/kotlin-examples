package other.e011_Annotations

internal object Validate {
    fun person(p: Person): Boolean {
        val javaFields = p::class.java.declaredFields

        for (field in javaFields) {
            field.isAccessible = true

            for (ann in field.annotations) {
                val value = field.get(p)

                if (field.isAnnotationPresent(Positive::class.java)) {
                    if (!isValidPositive(value)) {
                        return false
                    }
                }

                if (field.isAnnotationPresent(NotBlankString::class.java)) {
                    if (!isValidNotBlankString(value)) {
                        return false
                    }
                }
            }
        }

        return true
    }

    fun isValidPositive(value: Any): Boolean {
        return when (value) {
            is Byte -> value > 0
            is Short -> value > 0
            is Int -> value > 0
            is Long -> value > 0
            is Float -> value > 0
            is Double -> value > 0
            else -> false
        }
    }

    fun isValidNotBlankString(value: Any): Boolean {
        return when (value) {
            is String -> value.isNotBlank()
            else -> false
        }
    }
}