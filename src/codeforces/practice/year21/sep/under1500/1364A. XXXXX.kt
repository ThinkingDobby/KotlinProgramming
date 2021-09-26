package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, x) = br.readLine().split(" ").map { it.toInt() }
        val inputs = br.readLine().split(" ").map { it.toInt() }
        if (inputs.sum() % x != 0) bw.write("$n")
        else {
            if (inputs.any { it % x != 0 }) {
                val ans = n - minOf(inputs.indexOfFirst { it % x != 0 } + 1, n - inputs.indexOfLast { it % x != 0 })
                bw.write("$ans")
            }
            else bw.write("-1")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
