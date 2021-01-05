package practice.baekjoon.section7

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val t = sc.nextInt()

    repeat(t) {
        val r = sc.nextInt()
        val s = sc.next()

        for (i in 0 until s.length) {
            repeat(r) {
                print(s[i])
            }
        }
        println()
    }
}

