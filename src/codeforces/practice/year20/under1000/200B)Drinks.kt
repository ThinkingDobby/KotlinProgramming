package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toInt() }

    inputs.forEach { it.toDouble() / 100.0 }
    val ans = inputs.sum() / n.toDouble()

    bw.write("$ans")

    bw.flush()
    bw.close()
}