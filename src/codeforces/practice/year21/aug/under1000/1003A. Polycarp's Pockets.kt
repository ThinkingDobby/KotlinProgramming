package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val memo = Array(101) { 0 }
    val inputs = br.readLine().split(" ").map { it.toInt() }
    for (i in inputs) {
        memo[i]++
    }

    bw.write("${memo.max()}")

    bw.flush()
    bw.close()
}