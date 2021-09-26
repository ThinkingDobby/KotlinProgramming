package codeforces.contests.virtual.global_16

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, s) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${s / (n / 2 + 1)}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
