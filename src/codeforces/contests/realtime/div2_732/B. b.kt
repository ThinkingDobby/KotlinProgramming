package codeforces.contests.realtime.div2_732

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val m = st.nextToken().toInt()

        val first = Array(n) { br.readLine() }
        val last = Array(n - 1) { br.readLine() }

        val check = Array(n) { false }
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (check[j]) continue
                for (k in 0 until n - 1) {
                    if (first[j][i] == last[k][i]) check[j] = true
                }
            }
        }

        bw.write("${first[check.indexOf(false)]}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}