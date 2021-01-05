package chap04.section3.assigningCaution

fun main() {
    hello()()
}

fun hello() = fun() {println("Hello")}  // 익명함수를 사용하는 것이 구별하기 쉬움