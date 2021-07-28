package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        var l = n / 2
        var h = n / 2 + 1

        while (true) {
            if (h > n) break
            else {
                bw.write("$h ")
                h++
            }
            if (l < 1) break
            else {
                bw.write("$l ")
                l--
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}