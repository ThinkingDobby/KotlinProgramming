package practice.baekjoon.section14
// 런타임 에러
import java.io.*
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val score = Array(n + 1) {0}
    for (i in 1..n) {
        score[i] = br.readLine().toInt()
    }
    val dp = Array(n + 1) {0}

    dp[1] = score[1]
    dp[2] = score[1] + score[2]
    dp[3] = max(score[1] + score[3], score[2] + score[3])
    for (i in 4..n) {
        dp[i] = max(dp[i - 3] + score[i - 1] + score[i], dp[i - 2] + score[i])
    }

    bw.write("${dp[n]}")

    bw.flush()
    bw.close()
}