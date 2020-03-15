package designPatterns.e006_Builder

class Person {
    private lateinit var name: String
    private lateinit var surname: String
    private var age = 0
    private var weight = 0.0
    private var height = 0.0
    private var location: String? = null

    class Builder {
        private val p: Person = Person()

        fun setName(name: String): Builder {
            p.name = name
            return this
        }

        fun setSurname(surname: String): Builder {
            p.surname = surname
            return this
        }

        fun setAge(age: Int): Builder {
            p.age = age
            return this
        }

        fun setWeight(weight: Double): Builder {
            p.weight = weight
            return this
        }

        fun setHeight(height: Double): Builder {
            p.height = height
            return this
        }

        fun setLocation(location: String?): Builder {
            p.location = location
            return this
        }

        fun build(): Person {
            return p
        }
    }

    override fun toString(): String {
        return "$name $surname, Age: $age, Weight: $weight, Height: $height, Location: $location"
    }
}