package codeforces.practice.year21.feb.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val dp = Array(250001) { 0L }
    for (i in dp.indices) {
        val now = 2 * i.toLong() + 1
        if (now == 1L) dp[i] = 0L
        else {
            dp[i] = dp[i - 1] + (now * 2 + (now - 2) * 2) * i
        }
    }

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        bw.write("${dp[(n - 1) / 2]}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
