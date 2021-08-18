package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val b = br.readLine().split(" ").map { it.toLong() }
    val a = Array(n) { -1L }

    a[0] = b[0]
    a[1] = b[0] + b[1]
    var max = maxOf(a[0], a[1])

    for (i in 2 until n) {
        a[i] = b[i] + max
        max = maxOf(max, a[i])
    }

    a.forEach { bw.write("$it ") }

    bw.flush()
    bw.close()
}
