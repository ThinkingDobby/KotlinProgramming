package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val inputs = br.readLine().split(" ").map { it.toInt() }.toMutableList()

    var cnt = 0
    for (i in 1 until n) {
        val tmp = k - (inputs[i - 1] + inputs[i])
        if (tmp > 0) {
            cnt += tmp
            inputs[i] += tmp
        }
    }


    bw.write("$cnt")
    bw.newLine()
    inputs.forEach { bw.write("$it ") }

    bw.flush()
    bw.close()
}