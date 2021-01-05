package practice.baekjoon.section3

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val cnt = sc.nextInt()
    repeat(cnt) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        println("Case #${it + 1}: $a + $b = ${a + b}")
    }
}