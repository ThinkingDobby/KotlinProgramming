package codeforces.practice.year21.oct.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toInt() }
    bw.write("${input.max()!! - input.min()!! + 1 - n}")

    bw.flush()
    bw.close()
}