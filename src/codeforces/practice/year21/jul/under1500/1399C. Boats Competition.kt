package codeforces.practice.year21.jul.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val memo = Array(n + 1) { 0 }
        val st = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            memo[st.nextToken().toInt()]++
        }

        var ans = 0
        for (i in 2..n * 2) {
            var sum = 0
            for (j in 1..n) {
                if (i - j <= n) {
                    if (i - j > j) sum += minOf(memo[i - j], memo[j])
                    else if (i - j == j) sum += memo[j] / 2
                }
            }
            ans = maxOf(ans, sum)
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}