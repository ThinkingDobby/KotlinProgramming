package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, k) = br.readLine().split(" ").map { it.toLong() }

        val temp = ((n - 1) / k + 1) * k
        val ans = temp / n + if (temp % n != 0L) 1 else 0
        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
