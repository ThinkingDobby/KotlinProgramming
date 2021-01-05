package chap03.section3

fun main() {
    val res1 = chap03.section3.funcref.sum(3, 2)
    val res2 = mul(chap03.section3.funcref.sum(3, 3), 3)

    println("res1: $res1")
    println("res2: $res2")
}

fun sum(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b