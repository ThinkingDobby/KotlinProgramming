package codeforces.contests.realtime.kotlin_heroes_p8

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a1 = br.readLine().toInt()
    val a2 = br.readLine().toInt()
    val k1 = br.readLine().toInt()
    val k2 = br.readLine().toInt()
    val n = br.readLine().toInt()

    val minV = maxOf(minOf(n - ((k1 - 1) * a1 + (k2 - 1) * a2), a1 + a2), 0)
    val maxV = if (k1 > k2) {
        val tmp = minOf(n / k2, a2)
        minOf((n - tmp * k2) / k1, a1) + tmp
    } else {
        val tmp = minOf(n / k1, a1)
        minOf((n - tmp * k1) / k2, a2) + tmp
    }

    bw.write("$minV $maxV")

    bw.flush()
    bw.close()
}