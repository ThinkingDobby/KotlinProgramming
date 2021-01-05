package baekjoon.section14

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val arr = Array(n + 1) { 0 }
    for (i in 1..n) {
        arr[i] = st.nextToken().toInt()
    }

    val dp = Array(n + 1) { 0 }

    var max = Int.MIN_VALUE
    for (i in 1..n) {
        dp[i] = Math.max(dp[i - 1] + arr[i], arr[i])    // 단순 비교하나 전체 비교하나 동일
        if (dp[i] > max) max = dp[i]
    }

    bw.write("$max")

    bw.flush()
    bw.close()
}