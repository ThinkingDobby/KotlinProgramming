package codeforces.practice.year20.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    val dp = Array(n + 1) { 0 }

    for (i in 0..n) {
        if (dp[i] == 0 && i != 0) continue
        if (i + a <= n) dp[i + a] = Math.max(dp[i] + 1, dp[i + a])
        if (i + b <= n) dp[i + b] = Math.max(dp[i] + 1, dp[i + b])
        if (i + c <= n) dp[i + c] = Math.max(dp[i] + 1, dp[i + c])
    }

    bw.write("${dp[n]}")

    bw.flush()
    bw.close()
}