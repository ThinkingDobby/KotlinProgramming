package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val inputs = Array(n + 1) { 0 }
    val st = StringTokenizer(br.readLine())
    for (i in 1..n) {
        inputs[i] = st.nextToken().toInt()
    }

    val dp = Array(n + 1) { 1 }
    for (i in 2..n) {
        if (inputs[i - 1] <= inputs[i]) {
            dp[i] = dp[i - 1] + 1
        }
    }

    bw.write("${dp.max()}")

    bw.flush()
    bw.close()
}