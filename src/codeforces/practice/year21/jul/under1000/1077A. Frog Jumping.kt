package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (a, b, k) = br.readLine().split(" ").map { it.toLong() }
        if (k % 2 == 0L) {
            bw.write("${a * (k / 2) - b * (k / 2)}")
        } else {
            bw.write("${a * (k / 2 + 1) - b * (k / 2)}")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
