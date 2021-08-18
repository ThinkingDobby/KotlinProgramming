package codeforces.contests.realtime.div2_737

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toDouble() }.sorted()
        val ans = (inputs.sum() - inputs.last()) / (n - 1) + inputs.last()
        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
