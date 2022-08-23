package codeforces.practice.year22.aug

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    for (t in 0 until n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }

        val l = y.toString().length
        var now = l
        if (x * (Math.pow(10.0, l.toDouble())).toInt() > y) now--

        var ans = 0
        var tot = y
        for (i in now downTo 0) {
            ans += tot / (x * Math.pow(10.0, i.toDouble())).toInt()
            tot %= (x * Math.pow(10.0, i.toDouble())).toInt()
        }
        ans += tot

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}