package chap06.section2.objectLateinit

data class Person(var name: String, var age: Int)

lateinit var person1: Person

fun main() {
    person1 = Person("Kildong", 30)
    print(person1.name + " is " + person1.age.toString())
}