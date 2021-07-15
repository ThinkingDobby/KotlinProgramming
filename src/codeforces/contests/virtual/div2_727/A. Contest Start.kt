package codeforces.contests.virtual.div2_727

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = br.readLine().toInt()
    repeat(k) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toLong()
        val x = st.nextToken().toLong()
        val t = st.nextToken().toLong()

        var sum = 0L
        if (n - t / x >= 0) {
            val temp1 = (n - t / x) * (t / x)
            val temp2 = (t / x) * (t / x - 1) / 2

            sum = temp1 + temp2
        } else {
            sum = n * (n - 1) / 2
        }
        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
