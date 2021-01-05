package practice.baekjoon.section1

fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    println(num1 * (num2 % 10))
    println(num1 * (num2 / 10 % 10))
    println(num1 * (num2 / 100))
    println(num1 * num2)
}

// 런타임 에러