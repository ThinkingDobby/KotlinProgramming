package practice.baekjoon.section1

fun main() {
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    var units = num2 % 10
    var tens = num2 / 10 % 10
    var hundreds = num2 / 100

    println(num1 * units)
    println(num1 * tens)
    println(num1 * hundreds)
    println(num1 * num2)
}

// 런타임 에러