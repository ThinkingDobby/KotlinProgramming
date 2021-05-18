package baekjoon.section21
// practice
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val k = br.readLine().toInt()

    var left = 1
    var right = k
    var ans = 0

    while (left <= right) {
        val mid = (left + right) / 2
        var count = 0
        for (i in 1..n) {
            count += Math.min(n, mid / i)
        }

        if (count < k) left = mid + 1
        else {
            ans = mid
            right = mid - 1
        }
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}