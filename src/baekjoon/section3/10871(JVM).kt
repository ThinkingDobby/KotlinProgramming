package practice.baekjoon.section3

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val x = sc.nextInt()

    repeat(n) {
        val input = sc.nextInt()
        if (input < x) print("$input ")
    }
}