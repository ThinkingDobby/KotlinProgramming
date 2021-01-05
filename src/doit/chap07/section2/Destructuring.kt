package chap07.section2

data class Example(val name: String, val email: String)

fun main() {
    val example = Example("Kildong", "aaa@naver.com")

    val (a, b) = example
    println("a: $a, b: $b")

    val name = example.component1()
    val email = example.component2()
    println("name: $name, email: $email")
}