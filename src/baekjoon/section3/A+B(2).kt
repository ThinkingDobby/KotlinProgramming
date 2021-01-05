package practice.baekjoon.section3

fun main() {
    val num = readLine()!!.toInt()
    for (i in 0 until num)
        println(readLine()!!.toString().split(" ").sumBy { it.toInt() })
}