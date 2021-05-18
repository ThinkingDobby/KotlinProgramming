package codeforces.practice.year21.may.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        bw.write("$n")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}