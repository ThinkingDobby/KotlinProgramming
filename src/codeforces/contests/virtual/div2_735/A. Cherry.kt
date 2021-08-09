package codeforces.contests.virtual.div2_735

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toLong() }

        var max = 0L
        for (i in 1 until n) {
            if (inputs[i - 1] * inputs[i] > max) {
                max = inputs[i - 1] * inputs[i]
            }
        }

        bw.write("$max")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}