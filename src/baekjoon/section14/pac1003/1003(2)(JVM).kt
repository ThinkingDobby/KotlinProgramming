package practice.baekjoon.section14.pac1003
// 참조한 코드
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val list = Array(41) { 0 to 0 }.apply {
        this[0] = 1 to 0
        this[1] = 0 to 1

        for (i in 2..40) {
            this[i] = this[i - 1].first + this[i - 2].first to this[i - 1].second + this[i - 2].second
        }
    }

    val br = BufferedReader(InputStreamReader(System.`in`))
    for (i in 1..br.readLine().toInt()) {
        val n = br.readLine().toInt()
        println("${list[n].first} ${list[n].second}")
    }
}