package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toLong()

    val ans = (n + 1) / 2
    if (n % 2 == 0L) bw.write("$ans")
    else bw.write("-$ans")

    bw.flush()
    bw.close()
}