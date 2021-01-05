package practice.baekjoon.section5

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val list = List(9) { sc.nextInt() }

    var max = 0
    var loc = 0

    for (i in 0..8) {
        if (max < list[i]) {
            max = list[i]
            loc = i
        }
    }

    print("$max\n${loc+1}")
}

