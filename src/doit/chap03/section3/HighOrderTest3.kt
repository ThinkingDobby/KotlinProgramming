package chap03.section3
fun main() {
    val out: () -> Unit = { println("Hello World") }

    out()
    val new = out       // 람다식 자료형이 정의된 경우: 이름으로 사용(해당 문장에서는 정의되었지만 표현 생략됨)
    new()
}