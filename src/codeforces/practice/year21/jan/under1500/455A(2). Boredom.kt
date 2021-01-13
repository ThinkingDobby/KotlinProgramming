package codeforces.practice.year21.jan.under1500
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val numbers = Array(100001) { 0 }
    val dp = Array(100001) { 0L }

    val st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        numbers[st.nextToken().toInt()]++
    }

    dp[0] = 0
    for (i in 1 until 100001) {
        dp[i] = i.toLong() * numbers[i]
        if (i >= 2) {
            dp[i] += dp[i - 2]
        }
        if (dp[i - 1] > dp[i]) {
            dp[i] = dp[i - 1]
        }
    }

    bw.write("${dp[100000]}")

    bw.flush()
    bw.close()
}