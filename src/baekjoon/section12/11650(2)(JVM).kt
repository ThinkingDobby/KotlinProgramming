package practice.baekjoon.section12
// 참조한 코드
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = Array(n) { sc.nextInt() to sc.nextInt() }
    arr.sortWith(kotlin.Comparator { a, b -> if (a.second - b.second == 0) a.first - b.first else a.second - b.second })
    arr.forEach { println("${it.first} ${it.second}") }
}