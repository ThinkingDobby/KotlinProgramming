package baekjoon.section14

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val dp = Array(21){Array(21){Array(21){0}} }

    for (i in 0..20) {
        for (j in 0..20) {
            dp[0][i][j] = 1
            dp[i][0][j] = 1
            dp[i][j][0] = 1
        }
    }

    for (i in 1..20) {
        for (j in 1..20) {
            for (k in 1..20) {
                if (i < j && j < k) dp[i][j][k] = dp[i][j][k - 1] + dp[i][j - 1][k - 1] - dp[i][j - 1][k]
                else dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k] + dp[i - 1][j][k - 1] - dp[i - 1][j - 1][k - 1]
            }
        }
    }

    while (true) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val c = st.nextToken().toInt()


        if (a == -1 && b == -1 && c == -1) break

        var ans: Int
        if (a <= 0 || b <= 0 || c <= 0) {
            ans = 1
        } else if (a > 20 || b > 20 || c > 20) {
            ans = dp[20][20][20]
        } else {
            ans = dp[a][b][c]
        }

        bw.write("w($a, $b, $c) = $ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}