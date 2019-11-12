package basics

import java.util.*

class Person(var name: String, var yearOfBirth: Int) {
    init {
       name = name.toUpperCase()
    }

    // This property cannot be assigned
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var civilStatus: String = ""
        set(value) {
            if (!listOf("single", "married").contains(value)) {
                throw Exception("Invalid civil status")
            }

            field = value
        }
}

fun main() {
    var person = Person("Rafael", 1991)

    println(person.name)
    println(person.age)
    person.civilStatus = "single"
    println(person.civilStatus)

    person.civilStatus = "Free"
}

