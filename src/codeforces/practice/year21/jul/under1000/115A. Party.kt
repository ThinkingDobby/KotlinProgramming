package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = Array(n + 1) { 0 }
    for (i in 1..n) {
        inputs[i] = br.readLine().toInt()
    }

    val memo = Array(n + 1) {0}
    fun find(idx: Int) {
        var set = idx
        var count = 1
        while (inputs[set] != -1) {
            set = inputs[set]
            count++
        }
        if (memo[set] < count) memo[set] = count
    }

    for (i in 1..n) {
        find(i)
    }

    bw.write("${memo.filter {it != 0}.max()}")

    bw.flush()
    bw.close()
}