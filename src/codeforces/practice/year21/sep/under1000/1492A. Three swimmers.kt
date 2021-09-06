package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (p, a, b, c) = br.readLine().split(" ").map { it.toLong() }
        val at = if (p <= a) a - p else ((p - 1) / a + 1) * a - p
        val bt = if (p <= b) b - p else ((p - 1) / b + 1) * b - p
        val ct = if (p <= c) c - p else ((p - 1) / c + 1) * c - p

        bw.write("${minOf(at, bt, ct)}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
