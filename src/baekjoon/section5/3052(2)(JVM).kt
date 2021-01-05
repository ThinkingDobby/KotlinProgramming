package practice.baekjoon.section5

import java.io.*

fun main() {
    print(List(10) { BufferedReader(InputStreamReader(System.`in`)).readLine()!!.toInt() % 42 }.toSet().size)
}