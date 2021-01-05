package doit.chap10.section1

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)

    val user = User("Kildong", "default")

    val result = with(user) {
        skills = "Kotlin"
        email = "kildong@example.com"
    }

    val result2 = with(user) {
        skills = "Java"
        email = "kildong@example.com"
        "success"
    }

    println(user)
    println("result: $result")
    println("result2: $result2")
}
