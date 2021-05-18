package baekjoon.section17
// 참조한 코드, 최적화된 계산
import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine().toInt().let { print(it / 5 + it / 25 + it / 125) }
}