package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine().split(" ").map { it.toInt() }.reversed()

        input.forEach { bw.write("$it ") }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
