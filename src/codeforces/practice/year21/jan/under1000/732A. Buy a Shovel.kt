package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val k = st.nextToken().toInt()
    val r = st.nextToken().toInt()

    var i = 1

    var tmp = k
    while (true) {
        if (tmp % 10 == r || tmp % 10 == 0) break
        tmp += k
        i++
    }

    bw.write("$i")

    bw.flush()
    bw.close()
}