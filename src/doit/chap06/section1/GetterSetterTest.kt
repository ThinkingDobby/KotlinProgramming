package chap06.section1

import chap06.section1.KotlinGetSet.User

class User(val id: Int, var name: String, var age: Int)

fun main() {
    val user = User(1, "Sean", 30)

    val name = user.name

    user.age = 41

    println("name: $name, ${user.age}")
}