package codeforces.practice.year20.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val l = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val lanterns = Array(n) { st2.nextToken().toInt() }.sorted()

    var max = 0
    for (i in 1 until n) {
        val tmp = lanterns[i] - lanterns[i - 1]
        if (tmp > max) max = tmp
    }

    var ans = max.toDouble() / 2
    if (lanterns[0] > ans) {
        ans = lanterns[0].toDouble()
    }
    if (l - lanterns.last() > ans) {
        ans = (l - lanterns.last()).toDouble()
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}