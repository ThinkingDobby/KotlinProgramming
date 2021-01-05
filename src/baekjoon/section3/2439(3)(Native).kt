package practice.baekjoon.section3

fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        print(" ".repeat(n - i))
        println("*".repeat(i))
    }
}