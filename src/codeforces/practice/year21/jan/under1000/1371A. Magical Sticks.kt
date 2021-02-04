package codeforces.practice.year21.jan.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine().toLong()
        val tmp = (input * (input + 1)) / 2

        bw.write("${tmp / input}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}