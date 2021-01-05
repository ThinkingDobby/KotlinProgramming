package chap05.section3

fun main() {
    val calc = Calc()

    println(calc.add(3,6))
    println(calc.add(3, 6,1))
    println(calc.add("Hello", "World"))
    println(calc.add(4.6, 2.6))
}

class Calc {
    fun add(x: Int, y: Int) = x + y
    fun add(x: Double, y: Double) = x + y
    fun add(x: Int, y: Int, z: Int) = x + y + z
    fun add(x: String, y: String) = x + y
}
