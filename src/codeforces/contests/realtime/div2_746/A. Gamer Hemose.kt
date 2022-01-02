package codeforces.contests.realtime.div2_746

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, h) = br.readLine().split(" ").map { it.toLong() }
        val inputs = br.readLine().split(" ").map { it.toLong() }.sortedDescending()
        val a = inputs[0] + inputs[1]
        var tmp = (h + a - 1) / a
        var cnt = 0
        if ((tmp - 1) * a + inputs[0] >= h) cnt++
        bw.write("${tmp * 2 - cnt}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}