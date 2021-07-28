package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt().toString(2).length
        bw.write("${(Math.pow(2.0, n.toDouble() - 1) - 1).toInt()}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}