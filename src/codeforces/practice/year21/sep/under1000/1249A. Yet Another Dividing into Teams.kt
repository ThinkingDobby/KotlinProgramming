package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }.sorted()
        if ((1 until n).any { Math.abs(inputs[it] - inputs[it - 1]) == 1 }) bw.write("2")
        else bw.write("1")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
