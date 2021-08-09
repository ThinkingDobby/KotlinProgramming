package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = br.readLine().split(" ").map { it.toLong() }

    for (i in 0 until n) {
        var min = 0L
        var max = 0L

        if (i == 0) {
            min = Math.abs(inputs[1] - inputs[0])
            max = Math.abs(inputs.last() - inputs[0])
        } else if (i == n - 1) {
            min = Math.abs(inputs.last() - inputs[n - 2])
            max = Math.abs(inputs.last() - inputs[0])
        } else {
            min = minOf(Math.abs(inputs[i] - inputs[i - 1]), Math.abs(inputs[i + 1] - inputs[i]))
            max = maxOf(Math.abs(inputs[i] - inputs.first()), Math.abs(inputs.last() - inputs[i]))
        }

        bw.write("$min $max")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
