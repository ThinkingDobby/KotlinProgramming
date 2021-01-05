package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var count = 0
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val p = st.nextToken().toInt()
        val q = st.nextToken().toInt()
        if (q - p >= 2) count++
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}