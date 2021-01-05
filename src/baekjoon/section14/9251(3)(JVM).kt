package baekjoon.section14
// practice
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val firstInput = br.readLine()
    val secondInput = br.readLine()

    val dp = Array(firstInput.length + 1) { Array(secondInput.length + 1) { 0 } }

    for (i in 1..firstInput.length) {
        for (j in 1..secondInput.length) {
            if (firstInput[i - 1] == secondInput[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
            } else {
                dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j])
            }
        }
    }

    bw.write("${dp[firstInput.length][secondInput.length]}")

    bw.flush()
    bw.close()
}