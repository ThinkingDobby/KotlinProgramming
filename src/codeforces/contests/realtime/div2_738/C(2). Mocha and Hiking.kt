package codeforces.contests.realtime.div2_738

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        val input = listOf(0) + br.readLine().split(" ").map { it.toInt() } + listOf(1)
        val k = (0..n).indexOfFirst { input[it] == 0 && input[it + 1] == 1 }
        val ans = (1..k) + listOf(n + 1) + (k + 1..n)
        bw.write("${ans.joinToString(" ")}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}