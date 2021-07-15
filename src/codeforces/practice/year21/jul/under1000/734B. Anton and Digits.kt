package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var (k2, k3, k5, k6) = br.readLine().split(" ").map { it.toInt() }
    val min = minOf(k2, k5, k6)
    val ans = min * 256 + minOf(k3, k2 - min) * 32

    bw.write("$ans")

    bw.flush()
    bw.close()
}
