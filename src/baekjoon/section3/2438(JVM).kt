package practice.baekjoon.section3

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    repeat(n) {
        repeat(it + 1) {
            print("*")
        }
        println()
    }
}