package chap04.section3

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b
    } catch (e: ArithmeticException) {
        println("Exception is handled. ${e.message}")       // e.message: 예외 발생 원인을 간략히 출력
    } finally {
        println("finally 블록 반드시 항상 실행됨")
    }
}