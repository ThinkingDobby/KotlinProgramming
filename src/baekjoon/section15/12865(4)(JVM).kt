package baekjoon.section15
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val k = st1.nextToken().toInt()

    val weights = Array(n + 1) { 0 }
    val values = Array(n + 1) { 0 }

    for (i in 1..n) {
        val st2 = StringTokenizer(br.readLine())
        weights[i] = st2.nextToken().toInt()
        values[i] = st2.nextToken().toInt()
    }

    val dp = Array(n + 1) { IntArray(k + 1) { 0 } }

    for (i in 1..n) {
        for (j in 1..k) {
            if (weights[i] > j) {
                dp[i][j] = dp[i - 1][j]
            } else {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i]] + values[i])
            }
        }
    }

    bw.write("${dp[n][k]}")

    bw.flush()
    bw.close()
}