package baekjoon.section14
// practice
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = Array(n) { br.readLine().toInt() }

    val dp = Array(n) { 0 }
    dp[0] = arr[0]
    if (n > 1) {        // n이 0, 1 인 경우 배열 범위 초과되므로 조건으로 나눠줘야
        dp[1] = arr[0] + arr[1]
    } else if (n > 2) {
        dp[2] = Math.max(dp[1], Math.max(arr[0] + arr[2], arr[1] + arr[2]))
    }


    for (i in 3 until n) {
        dp[i] = Math.max(dp[i - 3] + arr[i - 1], dp[i - 2]) + arr[i]
        dp[i] = Math.max(dp[i], dp[i - 1])
    }

    bw.write("${dp[n - 1]}")

    bw.flush()
    bw.close()
}