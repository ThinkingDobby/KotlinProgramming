package chap03.section5

fun main() {
    val a = 3
    val b = 6

    println(a multiply b)
}

infix fun Int.multiply(x: Int): Int = this*x