package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (a, k) = br.readLine().split(" ").map { it.toLong() }

        bw.write("${rec(a, 1, k)}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

private fun rec(num: Long, now: Long, target: Long): Long {
    if (now == target) return num

    val tmp = num.toString().map { it - '0' }
    val max = tmp.max()!!.toLong()
    val min = tmp.min()!!.toLong()
    if (min == 0L) return num

    return rec(num + max * min, now + 1, target)
}