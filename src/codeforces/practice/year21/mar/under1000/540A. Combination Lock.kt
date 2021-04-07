package codeforces.practice.year21.mar.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val before = br.readLine()
    val after = br.readLine()
    var count = 0

    for (i in 0 until n) {
        val first = before[i].toInt() - 48
        val second = after[i].toInt() - 48

        val a = first + 10 - second
        val b = 10 - first + second
        val c = Math.abs(first - second)

        count += Math.min(a, Math.min(b, c))
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}