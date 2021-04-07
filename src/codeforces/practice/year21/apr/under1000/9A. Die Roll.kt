package codeforces.practice.year21.apr.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val y = st.nextToken().toInt()
    val w = st.nextToken().toInt()

    val tmp = Math.max(y, w)
    val ans = when (tmp) {
        1 -> "1/1"
        2 -> "5/6"
        3 -> "2/3"
        4 -> "1/2"
        5 -> "1/3"
        else -> "1/6"
    }

    bw.write(ans)

    bw.flush()
    bw.close()
}