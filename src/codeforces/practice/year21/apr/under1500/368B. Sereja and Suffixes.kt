package codeforces.practice.year21.apr.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val inputs = Array(n) { st2.nextToken().toInt() }

    val dp = Array(100001) { 0 }
    val memo = Array(n + 1) { 0 }
    var count = 0
    for (i in n - 1 downTo 0) {
        if (dp[inputs[i]] == 0) {
            count++
            dp[inputs[i]] = 1
        }
        memo[i + 1] = count
    }

    repeat(m) {
        val input = br.readLine().toInt()

        bw.write("${memo[input]}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}



