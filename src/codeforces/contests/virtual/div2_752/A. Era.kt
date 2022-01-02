package codeforces.contests.virtual.div2_752

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val ans = br.readLine().split(" ").map { it.toInt() }.withIndex().map { it.value - 1 - it.index }.max()
        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
