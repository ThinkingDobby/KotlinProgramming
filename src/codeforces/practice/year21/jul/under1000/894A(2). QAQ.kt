package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    var q = 0
    var qa = 0
    var qaq = 0

    for (i in input.indices) {
        if (input[i] == 'Q') {
            q++
            qaq += qa
        } else if (input[i] == 'A') {
            qa += q
        }
    }

    bw.write("$qaq")

    bw.flush()
    bw.close()
}