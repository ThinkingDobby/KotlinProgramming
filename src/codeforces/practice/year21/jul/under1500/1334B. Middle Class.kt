package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, x) = br.readLine().split(" ").map { it.toInt() }
        val inputs = br.readLine().split(" ").map { it.toLong() }.sorted()

        var sum = inputs.sum()
        for (i in 0..n) {
            if (i == n) {
                bw.write("0")
                break
            }
            if (sum / (n - i) >= x) {
                bw.write("${n - i}")
                break
            }
            sum -= inputs[i]
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
