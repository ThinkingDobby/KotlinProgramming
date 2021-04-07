package codeforces.practice.year21.feb.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    val l = st.nextToken().toInt()
    val c = st.nextToken().toInt()
    val d = st.nextToken().toInt()
    var p = st.nextToken().toInt()
    val nl = st.nextToken().toInt()
    val np = st.nextToken().toInt()

    var tmp1 = l * k
    var tmp2 = c * d

    val tmp = Math.min(tmp1 / nl, Math.min(tmp2, p / np))

    bw.write("${tmp / n}")

    bw.flush()
    bw.close()
}
