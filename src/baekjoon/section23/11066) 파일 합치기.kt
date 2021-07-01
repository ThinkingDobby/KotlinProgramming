package baekjoon.section23
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    val dp = Array(501) { IntArray(501) { 0 } }
    val sum = Array(501) { 0 }

    repeat(t) {
        val k = br.readLine().toInt()

        val st = StringTokenizer(br.readLine())
        for (i in 1..k) {
            val cost = st.nextToken().toInt()
            sum[i] = sum[i - 1] + cost
        }

        for (d in 1 until k) {
            for (tx in 1..k - d) {
                val ty = tx + d
                dp[tx][ty] = Int.MAX_VALUE

                for (mid in tx until ty) {
                    dp[tx][ty] = Math.min(dp[tx][ty], dp[tx][mid] + dp[mid + 1][ty] + sum[ty] - sum[tx - 1])
                }
            }
        }

        bw.write("${dp[1][k]}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
