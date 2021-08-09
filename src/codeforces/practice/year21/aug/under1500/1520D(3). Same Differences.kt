package codeforces.practice.year21.aug.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val memo = mutableMapOf<Int, Long>()

        val st = StringTokenizer(br.readLine())
        var ans = 0L
        for (i in 1..n) {
            val temp = st.nextToken().toInt() - i
            ans += memo[temp] ?: 0
            memo[temp] = (memo[temp] ?: 0) + 1
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}