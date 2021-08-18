package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }.sorted()

        bw.write("${(0 until n).map { listOf(inputs[it], inputs[it + n]) }.flatten().joinToString(" ")}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}