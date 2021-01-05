package chap04.section3

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b
    } catch (e: ArithmeticException) {
       e.printStackTrace()      // 스택 추적: 예외 발생 확인, 오류 발생 코드 줄 확인 가능
    } finally {
        println("finally 블록 반드시 항상 실행됨")
    }
}