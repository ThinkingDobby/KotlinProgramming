package codeforces.contests.virtual.div2_727

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val q = st1.nextToken().toInt()

    val s = br.readLine()

    val memo = Array(n + 1){0}
    memo[1] = s[0].toInt() - 96
    for (i in 2..n) {
        memo[i] = memo[i - 1] + (s[i - 1].toInt() - 96)
    }

    repeat(q) {
        val st2 = StringTokenizer(br.readLine())
        val l = st2.nextToken().toInt()
        val r = st2.nextToken().toInt()

        val ans = memo[r] - memo[l - 1]

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
