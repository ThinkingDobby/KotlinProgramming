package chap06.section1

class PersonA(var name: String, var age: Int)

fun main() {
    val p1 = PersonA("Kildong", 30)
    p1.name = "Dooly"
    println(p1.name)
}