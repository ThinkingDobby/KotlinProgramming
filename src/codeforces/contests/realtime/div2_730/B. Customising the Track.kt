package codeforces.contests.realtime.div2_730

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toLong() }
        val mod = inputs.sum() % n
        val ans = (n - mod) * mod
        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
