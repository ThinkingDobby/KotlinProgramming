package practice.baekjoon.section4

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    while(true) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        if (a == 0 && b == 0) break
        else println(a + b)
    }
}