package practice.baekjoon.section2

fun main() {
    val input = readLine()!!.split(" ")
    val a: Int = input[0].toInt()
    val b: Int = input[1].toInt()

    when {
        a > b -> println(">")
        a < b -> println("<")
        else -> println("==")
    }
}