package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val inputs = br.readLine().split(" ").map { it.toLong() }
        val ans = inputs.subList(1, 4).map { ((it + inputs[0] - 1) / it) * it - inputs[0] }.min()
        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
