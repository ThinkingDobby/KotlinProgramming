package codeforces.contests.realtime.div3_693

import java.io.*
import java.lang.Exception
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val inputs = Array(n){st.nextToken().toInt()}

        val dp = Array(n){0L}
        for (i in 0 until n) {
            dp[i] = inputs[i].toLong()
        }

        for (i in 0 until n) {
            try {
                if (i + inputs[i] <= n - 1) dp[i + inputs[i]] = Math.max(inputs[i + inputs[i]] + dp[i], dp[i + inputs[i]])
            } catch (e:Exception) {
            }
        }

        bw.write("${dp.max()}")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}