package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        if (n == 1) bw.write("-1")
        else {
            bw.write("2")
            for (i in 1 until n) {
                bw.write("7")
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
