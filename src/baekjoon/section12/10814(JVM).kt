package practice.baekjoon.section12

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr = Array(n){ Triple(it, sc.nextInt(), sc.next())}

    arr.sortWith(kotlin.Comparator { a, b ->
        if (a.second == b.second) a.first - b.first
        else a.second - b.second
    })

    for (i in arr)
        println("${i.second} ${i.third}")
}
