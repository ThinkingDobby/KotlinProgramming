package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        for (i in 1..n) {
            bw.write("$i ")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
