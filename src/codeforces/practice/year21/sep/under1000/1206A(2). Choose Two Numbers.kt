package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }
    val m = br.readLine().toInt()
    val b = br.readLine().split(" ").map { it.toInt() }

    bw.write("${a.max()} ${b.max()}")

    bw.flush()
    bw.close()
}