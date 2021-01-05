package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toLong()
    val k = st.nextToken().toLong()

    if (k <= (n + 1) / 2) {
        bw.write("${2 * k - 1}")
    } else {
        bw.write("${(k - (n + 1) / 2) * 2}")
    }

    bw.flush()
    bw.close()
}