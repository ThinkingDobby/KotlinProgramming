package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val input = br.readLine()

    var now = 0
    var i = 0

    while (true) {
        bw.write("${input[now]}")
        i++
        now += i
        if (now >= n) break
    }

    bw.flush()
    bw.close()
}