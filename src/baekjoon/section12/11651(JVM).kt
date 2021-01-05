package practice.baekjoon.section12
// 참조한 코드
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = Array(n) { sc.nextInt() to sc.nextInt() }
    arr.sortWith(kotlin.Comparator { a, b -> if (a.first - b.first == 0) a.second - b.second else a.first - b.first })
    arr.forEach { println("${it.first} ${it.second}") }
}