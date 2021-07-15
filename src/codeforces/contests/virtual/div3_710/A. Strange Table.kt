package codeforces.contests.virtual.div3_710

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toLong()
        val m = st.nextToken().toLong()
        val x = st.nextToken().toLong()

        val line = x / n
        val pos = x % n
        val ans = if (pos == 0L) {
            line + m * (n - 1)
        } else {
            (line + 1) + m * (pos - 1)
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}