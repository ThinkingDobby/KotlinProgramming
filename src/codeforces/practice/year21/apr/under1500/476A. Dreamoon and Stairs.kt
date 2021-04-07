package codeforces.practice.year21.apr.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    var remain = 0
    val tmp = (n + 1) / 2
    if (n % 2 == 1) remain = 1
    val target = if (tmp % m == 0) tmp else (tmp / m + 1) * m

    if (target - tmp <= tmp - remain) bw.write("$target")
    else bw.write("-1")

    bw.flush()
    bw.close()
}
