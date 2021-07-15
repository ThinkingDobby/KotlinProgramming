package codeforces.contests.virtual.div2_edu_108

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val r = st.nextToken().toLong()
        val b = st.nextToken().toLong()
        val d = st.nextToken().toLong()

        val min = Math.min(r, b)
        val max = Math.max(r, b)

        if ((d + 1) * min >= max) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
