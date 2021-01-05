package practice.baekjoon.section14

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val dp = Array(101) { LongArray(11) }

    for (i in 1..9) {
        dp[1][i] = 1
    }

    for (i in 2..n) {
        dp[i][0] = dp[i - 1][1]
        for (j in 1..9) {
            dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000
        }
    }

    var sum: Long = 0
    for (i in 0..9) {
        sum += dp[n][i]
    }

    bw.write("${sum % 1000000000}")

    bw.flush()
    bw.close()
}