package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine().split(" ").map { it.toInt() }.sorted()

        val min = input[0]
        val cnt = input.count { it > min }
        bw.write("$cnt")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}