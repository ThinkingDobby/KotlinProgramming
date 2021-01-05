package baekjoon.section14

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val arr = Array(n + 2){0}
    val st = StringTokenizer(br.readLine())
    for (i in 1..n) {
        arr[i] = st.nextToken().toInt()
    }

    val dp = Array(n + 2){0}
    val dpLeft = Array(n + 2){0}

    for (i in 1..n) {
        var max = 0
        for (j in 0 until i) {
            if (arr[i] > arr[j]) {
                if (dp[j] > max) max = dp[j]
            }
        }
        dp[i] = max + 1
    }

    for (i in n downTo 1) {
        var maxLeft = 0
        for (j in n + 1 downTo i + 1) {
            if (arr[i] > arr[j]) {
                if (dpLeft[j] > maxLeft) maxLeft = dpLeft[j]
            }
        }
        dpLeft[i] = maxLeft + 1
    }

    val ans = dp.zip(dpLeft).map{it.first + it.second - 1}.max()

    bw.write("$ans")

    bw.flush()
    bw.close()
}