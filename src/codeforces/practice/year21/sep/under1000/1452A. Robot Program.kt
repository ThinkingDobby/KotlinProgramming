package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${minOf(x, y) * 2 + maxOf(0, Math.abs(x - y) * 2 - 1)}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
