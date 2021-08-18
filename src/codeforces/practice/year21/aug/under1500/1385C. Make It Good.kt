package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }

        var increasing = true
        var end = -1
        for (i in n - 2 downTo 0) {
            if (increasing && inputs[i] < inputs[i + 1]) increasing = false
            if (!increasing && inputs[i] > inputs[i + 1]) {
                end = i
                break
            }
        }

        bw.write("${end + 1}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}