package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().split(" ").map { it.toInt() }
    if (input.sum() % 5 == 0) {
        if (input.sum() / 5 == 0) {
            bw.write("-1")
        } else {
            bw.write("${input.sum() / 5}")
        }
    } else {
        bw.write("-1")
    }

    bw.flush()
    bw.close()
}