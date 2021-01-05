package chap03.section1

fun main() {
    val result: Int
    val num1 = 10
    val num2 = 3


    result = max(num1, num2)
    println("max: $result")
}

fun max(a: Int, b: Int) = if(a>b) a else b