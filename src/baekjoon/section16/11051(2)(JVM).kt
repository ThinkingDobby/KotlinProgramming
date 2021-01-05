package baekjoon.section16
// 조합의 성질 (파스칼의 법칙)
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    val dp = Array(1001) { IntArray(1001) }
    dp[1][0] = 1
    dp[1][1] = 1
    for (i in 2..n) {
        for (j in 0..i) {
            if (j == 0 || j == i) {
                dp[i][j] = 1
            } else {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
            }
            dp[i][j] %= 10007
        }
    }

    bw.write("${dp[n][k]}")

    bw.flush()
    bw.close()
}