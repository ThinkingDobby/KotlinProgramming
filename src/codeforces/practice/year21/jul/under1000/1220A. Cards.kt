package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val input = br.readLine()

    var cnt1 = 0
    var cnt0 = 0
    for (i in input) {
        if (i == 'z') cnt0++
        else if (i == 'n') cnt1++
    }

    repeat(cnt1) {
        bw.write("1 ")
    }

    repeat(cnt0) {
        bw.write("0 ")
    }

    bw.flush()
    bw.close()
}
