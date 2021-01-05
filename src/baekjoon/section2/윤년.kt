package practice.baekjoon.section2

fun main() {
    val year = readLine()!!.toInt()

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) println("1")
    else println("0")
}