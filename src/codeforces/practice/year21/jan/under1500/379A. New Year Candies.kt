package codeforces.practice.year21.jan.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    var now = a
    var count = 0
    var special = 0
    while (true) {
        count += now
        now += special
        if (now / b == 0) break
        special = now % b
        now /= b
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}