package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (i == n - 1 && j == m - 1) bw.write("W")
                else bw.write("B")
            }
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
}
