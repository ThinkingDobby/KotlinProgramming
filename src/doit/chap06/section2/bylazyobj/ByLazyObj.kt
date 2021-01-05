package chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInitialized: Boolean = false

    val person: Person by lazy {
        isPersonInitialized = true
        Person("Kim", 23)
    }
    val personDelegate = lazy { Person("Hong", 40) }

    println("person Init: $isPersonInitialized")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person Init: $isPersonInitialized")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}