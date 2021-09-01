package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val tmp = (n - 1) / 4 + 1
        bw.write("${"9".repeat(n - tmp)}${"8".repeat(tmp)}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
