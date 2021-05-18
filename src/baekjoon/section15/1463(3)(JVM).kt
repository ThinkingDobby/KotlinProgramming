package baekjoon.section15
// practice
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val dp = Array(100001) { 0 }

    for (i in 2..n) {
        dp[i] = dp[i - 1] + 1
        if (i % 2 == 0) {
            dp[i] = Math.min(dp[i - 1], dp[i / 2]) + 1
        }
        if (i % 3 == 0) {
            dp[i] = Math.min(dp[i - 1], dp[i / 3]) + 1
        }
    }

    bw.write("${dp[n]}")

    bw.flush()
    bw.close()
}