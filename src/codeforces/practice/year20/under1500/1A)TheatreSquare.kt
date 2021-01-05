package codeforces.practice.year20.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toLong()
    val m = st.nextToken().toLong()
    val a = st.nextToken().toLong()

    val resultN = if (n % a == 0L) n / a else n / a + 1
    val resultM = if (m % a == 0L) m / a else m / a + 1
    val ans = resultN * resultM

    bw.write("$ans")

    bw.flush()
    bw.close()
}