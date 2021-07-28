package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }

        var max = Int.MIN_VALUE
        var maxIdx = -1
        for (i in 0 until n - 1) {
            if (inputs[i] != inputs[i + 1]) {
                if (inputs[i] > inputs[i + 1] && inputs[i] > max) {
                    max = inputs[i]
                    maxIdx = i
                } else if (inputs[i + 1] > max) {
                    max = inputs[i + 1]
                    maxIdx = i + 1
                }
            }
        }
        if (max == Int.MIN_VALUE) bw.write("-1")
        else bw.write("${maxIdx + 1}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}