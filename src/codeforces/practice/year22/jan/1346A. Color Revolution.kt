package codeforces.practice.year22.jan

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, k) = br.readLine().split(" ").map { it.toLong() }
        val n1 = n / (k * k * k + k * k + k + 1)
        bw.write("$n1 ${n1 * k} ${n1 * k * k} ${n1 * k * k * k}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}