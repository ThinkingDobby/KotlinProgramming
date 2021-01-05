package chap03.section1

fun main() {
    val name = "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name, email)
    add("둘리", "dooly@example.kr")
    defaultArgs()
    defaultArgs(200)
}

fun add(a: String, b: String = "default"){
    println("${a}님의 이메일주소는 ${b}입니다.")
}

fun defaultArgs(a: Int = 100, b: Int = 200) = println("a + b = ${a + b}")