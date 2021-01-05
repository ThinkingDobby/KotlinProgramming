package practice.baekjoon.section3

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    repeat(n) {
        repeat(n - (it + 1)) {
            print(" ")
        }
        repeat(it + 1) {
            print("*")
        }
        println()
    }
}