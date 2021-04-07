package atcoder.practice.abc_c
// 미완성
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val dp = Array(n + 1) { LongArray(3) }
    dp[1][0] = 1
    dp[1][1] = 1
    for (i in 2..n) {
        for (j in 0..2) {
            if (j == 0 || j == i) {
                dp[i][j] = 1
            } else {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
            }
            dp[i][j] %= 1_000_000_007L
        }
    }

    var tmp = dp[n][2] * 2
    repeat(n - 2) {
        tmp *= 10
        tmp %= 1000000007L
    }

    bw.write("$tmp")

    bw.flush()
    bw.close()
}