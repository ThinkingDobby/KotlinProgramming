package codeforces.contests.realtime.div2_738

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toLong() }

        var ans = inputs[0]
        for (i in 1 until n) {
            ans = ans.and(inputs[i])
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

