package codeforces.practice.year21.jan.under1500
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val inputs = Array(100001) { 0 }

    val st = StringTokenizer(br.readLine())
    repeat(n) {
        inputs[st.nextToken().toInt()]++
    }

    val dp = Array(100001) { 0L }
    dp[0] = 0

    for (i in 1 until 100001) {
        dp[i] = i.toLong() * inputs[i]
        if (i > 1) dp[i] += dp[i - 2]
        if (dp[i - 1] > dp[i]) dp[i] = dp[i - 1]
    }

    bw.write("${dp[100000]}")

    bw.flush()
    bw.close()
}