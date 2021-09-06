package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = br.readLine().split(" ").map { it.toLong() }
    val memo = Array(n + 1) { 0L }
    for (i in 0 until n) {
        memo[i + 1] = memo[i] + inputs[i]
    }

    val sortedInputs = inputs.sorted()
    val sortedMemo = Array(n + 1) { 0L }
    for (i in 0 until n) {
        sortedMemo[i + 1] = sortedMemo[i] + sortedInputs[i]
    }

    repeat(br.readLine().toInt()) {
        val (t, l, r) = br.readLine().split(" ").map { it.toInt() }

        var ans = 0L
        if (t == 1) {
            ans = memo[r] - memo[l - 1]
        } else if (t == 2) {
            ans = sortedMemo[r] - sortedMemo[l - 1]
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}