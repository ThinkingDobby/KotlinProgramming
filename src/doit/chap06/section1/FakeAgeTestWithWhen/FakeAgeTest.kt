package chap06.section1.FakeAgeTestWithWhen

class FakeAge {
    var age: Int = 0
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }
}

fun main() {
    val Kildong = FakeAge()
    Kildong.age = 15
    println("Kildong's age: ${Kildong.age}")

    val Dooly = FakeAge()
    Dooly.age = 35
    println("Dooly's age: ${Dooly.age}")
}