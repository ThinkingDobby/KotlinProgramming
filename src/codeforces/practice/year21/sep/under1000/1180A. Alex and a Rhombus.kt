package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    bw.write("${1 + 2 * n * n - 2 * n}")

    bw.flush()
    bw.close()
}