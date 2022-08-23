package codeforces.contests.virtual.kotlin_heroes_8

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val (a, va) = br.readLine().split(" ").map { it.toInt() }
        var (c, vc) = br.readLine().split(" ").map { it.toInt() }
        val b = br.readLine().toInt()

        bw.write("${maxOf(va, vc - (c - b))}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
