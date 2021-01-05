package practice.baekjoon.section5

fun main() {
    val size = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map{it.toInt()}
    print("${arr.min()} ${arr.max()}")
}