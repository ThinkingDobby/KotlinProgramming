package baekjoon.section21
// 참조한 코드
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toLong()
    val k = br.readLine().toLong()

    var left = 1L
    var right = k
    var ans = 0L

    while (left <= right) {
        val mid = (left + right) / 2
        var count = 0L

        for (i in 1..n) {
            count += Math.min(mid / i, n)
        }

        if (count < k) {
            left = mid + 1
        } else {
            ans = mid
            right = mid - 1
        }
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}



