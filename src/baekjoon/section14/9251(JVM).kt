package baekjoon.section14
// 참조한 코드 - 재귀
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()
    val m = br.readLine()

    val dp = Array(n.length) { IntArray(m.length) { -1 } }

    fun lcs(x: Int, y: Int): Int {
        if (x == -1 || y == -1) {
            return 0
        }

        if (dp[x][y] == -1) {
            dp[x][y] = 0

            if (n[x] == m[y]) {
                dp[x][y] = lcs(x - 1, y - 1) + 1
            } else {
                dp[x][y] = Math.max(lcs(x - 1, y), lcs(x, y - 1))
            }
        }

        return dp[x][y]
    }

    bw.write("${lcs(n.length - 1, m.length - 1)}")

    bw.flush()
    bw.close()
}