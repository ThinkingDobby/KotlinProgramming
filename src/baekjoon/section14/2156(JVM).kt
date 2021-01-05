package baekjoon.section14

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = Array(n) { br.readLine().toInt() }


    val dp = Array(n){0}
    dp[0] = arr[0]
    if (n > 1) {
        dp[1] = arr[1] + arr[0]
        if (n > 2) {
            dp[2] = Math.max(arr[2] + arr[1], Math.max(arr[2] + arr[0], dp[1])) // 모든 경우 고려해야
        }
    }

    for (i in 3 until n) {
        dp[i] = Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i])
        dp[i] = Math.max(dp[i - 1], dp[i])
    }

    bw.write("${dp[n - 1]}")

    bw.flush()
    bw.close()
}