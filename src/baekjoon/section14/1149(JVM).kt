package baekjoon.section14

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val cost = Array(n) { IntArray(3) { 0 } }

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        cost[it][0] = st.nextToken().toInt()    // r
        cost[it][1] = st.nextToken().toInt()    // g
        cost[it][2] = st.nextToken().toInt()    // b
    }

    val dp = Array(n){IntArray(3){0}}
    dp[0][0] = cost[0][0]
    dp[0][1] = cost[0][1]
    dp[0][2] = cost[0][2]

    for (i in 1 until n) {
        dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0]    // i항에 r쓰는 경우까지의 합 = 그 전 항에서 g 또는 b 사용한 경우까지의 합 + i항에 r쓰는 경우
        dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1]    // 그 전 항 g 와 b 까지의 합 중 더 낮은 경우 선택 했을 것
        dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2]
    }

    bw.write("${dp[n - 1].min()}")

    bw.flush()
    bw.close()
}