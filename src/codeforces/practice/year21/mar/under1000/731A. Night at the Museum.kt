package codeforces.practice.year21.mar.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val name = br.readLine()
    var count = 0
    var prev = 97

    for (i in name) {
        count += Math.min(Math.abs(i.toInt() - prev), Math.min(123 - i.toInt() - 97 + prev, i.toInt() - 97 + 123 - prev))
        prev = i.toInt()
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}