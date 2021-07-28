package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, m, k) = br.readLine().split(" ").map { it.toInt() }

        val num = n / k
        val x = minOf(num, m)
        val rest = m - x
        val ans = x - (rest / (k - 1) + if (rest % (k - 1) == 0) 0 else 1)

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}