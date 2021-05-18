package baekjoon.section15
// practice
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val first = br.readLine()
    val second = br.readLine()

    val dp = Array(first.length + 1) { Array(second.length + 1){0} }

    for (i in 1..first.length) {
        for (j in 1..second.length) {
            if (first[i - 1] == second[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
            } else {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }

    bw.write("${dp[first.length][second.length]}")

    bw.flush()
    bw.close()
}