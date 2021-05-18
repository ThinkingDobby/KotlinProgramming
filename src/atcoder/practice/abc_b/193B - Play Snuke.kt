package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var min = Long.MAX_VALUE
    repeat(n) {
        val st = StringTokenizer(br.readLine())

        val a = st.nextToken().toLong()
        val b = st.nextToken().toLong()
        val c = st.nextToken().toLong()

        if (c - a > 0) {
            if (b < min) min = b
        }
    }

    if (min == Long.MAX_VALUE) {
        bw.write("-1")
    } else {
        bw.write("$min")
    }

    bw.flush()
    bw.close()
}