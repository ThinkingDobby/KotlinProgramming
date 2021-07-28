package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (x, y, a, b) = br.readLine().split(" ").map { it.toLong() }
        if ((y - x) % (a + b) == 0L) {
            bw.write("${(y - x) / (a + b)}")
        } else {
            bw.write("-1")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
