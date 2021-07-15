package codeforces.contests.virtual.div2_726

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
        val i = st.nextToken().toLong()
        val j = st.nextToken().toLong()

        var low = i < n / 2
        var left = j < m / 2

        if (low) {
            if (left) {
                bw.write("1 1 $n $m")
            } else {
                bw.write("$n 1 1 $m")
            }
        } else {
            if (left) {
                bw.write("$n 1 1 $m")
            } else {
                bw.write("1 1 $n $m")
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
