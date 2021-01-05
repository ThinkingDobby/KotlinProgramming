package baekjoon.section14
// 참조한 코드 - 반복
fun main() {
    val a = readLine()!!
    val b = readLine()!!
    val dp = Array(a.length + 1) { Array(b.length + 1) { 0 } }

    for (i in 1..a.length) {
        for (j in 1..b.length) {
            if (a[i - 1] == b[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
            } else {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }

    println(dp[a.length][b.length])
}