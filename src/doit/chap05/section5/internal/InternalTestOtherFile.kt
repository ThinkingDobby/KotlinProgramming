package chap05.section5.internal

fun main() {
    val otheric = InternalClass()

    println(otheric.i)
    val result = otheric.icFunc()

    println("result: $result")
}