package chap06.section1

class FakeAge {
    var age: Int = 0
        set(value) {
            if (value < 18) field = 18
            else if (value in 18..30) field = value
            else field = value -3
        }
}

fun main() {
    val Kildong = FakeAge()
    Kildong.age = 15
    println("age: ${Kildong.age}")

    val Dooly = FakeAge()
    Dooly.age = 35
    println("age: ${Dooly.age}")
}