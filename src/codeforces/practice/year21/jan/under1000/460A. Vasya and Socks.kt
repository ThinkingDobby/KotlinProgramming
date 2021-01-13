package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    var socks = n
    var day = 0
    while (true) {
        if (socks == 0) break
        day++
        socks--
        if (day % m == 0) socks++
    }

    bw.write("$day")

    bw.flush()
    bw.close()
}