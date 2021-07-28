package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (d1, d2, d3) = br.readLine().split(" ").map{it.toInt()}
    val ans = minOf((d1 + d2) * 2, d1 + d2 + d3, minOf((d1 + d3) * 2, (d2 + d3) * 2))

    bw.write("$ans")

    bw.flush()
    bw.close()
}