package codeforces.contests.realtime.div2_743

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine()
        var sum = 0
        for (i in 0 until n) {
            if (i != n - 1 && input[i] - '0' != 0) sum++
            sum += input[i] - '0'
        }

        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
