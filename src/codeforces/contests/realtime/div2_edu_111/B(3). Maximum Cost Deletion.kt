package codeforces.contests.realtime.div2_edu_111

import java.io.*
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, a, b) = br.readLine().split(" ").map { it.toInt() }
        val input = br.readLine()

        var f = (1 until n).count { input[it - 1] != input[it] && input[it] == '0' }
        var s = (1 until n).count { input[it - 1] != input[it] && input[it] == '1' }
        if (input[0] == '0') f++
        else s++

        val ans = a * n + max((min(f, s) + 1) * b, b * n)
        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}