package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        if (n == 2) {
            bw.write("-1")
            bw.newLine()
        } else {
            var now = 0
            for (i in 1..n) {
                for (j in 1..n) {
                    now++
                    if (j % 2 == 0) bw.write("${(now + n - 1) % (n * n) + 1} ")
                    else bw.write("$now ")
                }
                bw.newLine()
            }
        }
    }

    bw.flush()
    bw.close()
}