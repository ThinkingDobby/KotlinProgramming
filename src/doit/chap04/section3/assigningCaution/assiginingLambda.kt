package chap04.section3.assigningCaution

fun main() {
    greet()()   // 주의해야: greet()는 {println("Hello") 자체를 담고 있음
}

fun greet() = {println("Hello")}