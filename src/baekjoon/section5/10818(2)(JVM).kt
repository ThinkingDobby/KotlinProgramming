package practice.baekjoon.section5

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val size = sc.nextInt()
    val arr = ArrayList<Int>(size)

    for (i in 0 until size) {
        val tmp = sc.nextInt()
        arr.add(tmp)
    }

    print("${arr.min()} ${arr.max()}")
}