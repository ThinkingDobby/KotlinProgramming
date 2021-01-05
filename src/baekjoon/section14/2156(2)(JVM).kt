package baekjoon.section14
// practice
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val wine = Array(n) { br.readLine().toInt() }

    val dp = Array(n){0}
    dp[0] = wine[0]
    if (n > 1) {
        dp[1] = wine[0] + wine[1]
    } else if (n > 2) {
        dp[2] = Math.max(dp[1], Math.min(wine[0] + wine[2], wine[1] + wine[2]))
    }

    for (i in 3 until n) {
        dp[i] = Math.max(dp[i - 3] + wine[i - 1], dp[i - 2]) + wine[i]
        dp[i] = Math.max(dp[i - 1], dp[i])
    }

    bw.write("${dp[n - 1]}")

    bw.flush()
    bw.close()
}