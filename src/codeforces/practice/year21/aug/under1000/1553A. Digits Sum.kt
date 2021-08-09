package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        bw.write("${(br.readLine().toLong() + 1) / 10}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
