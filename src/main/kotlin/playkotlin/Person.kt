package playkotlin

class Person(val firstName: String, val lastName: String, val age: Int?) {
    val name: String
    get() {
        return this.firstName + this.lastName
    }

    init {
        require(firstName.trim().length > 0) {
            "Invalid first name"
        }

        require(lastName.trim().length > 0) {
            "Invalid last name"
        }

        if (age != null) {
            require(age > 0 && age < 150) {
                "Invalid Age"
            }
        }
    }
}

// extension
fun Person.getAge(): Int {
    return this.age ?: 0
}

infix fun Person.older(other: Person): Boolean {
    return this.getAge() > other.getAge()
}